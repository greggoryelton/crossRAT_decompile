package org.a.a.a;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: hmar6.jar:org/a/a/a/b.class */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static BigInteger f43a;

    /* renamed from: b  reason: collision with root package name */
    private static BigInteger f44b;
    private static BigInteger c;
    private static BigInteger d;
    private static BigInteger e;
    private static BigInteger f;

    public static void a(File file, File file2) {
        d(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' exists but is read-only");
        }
        a(file, file2, true);
    }

    private static void a(File file, File file2, boolean z) {
        if (!file2.exists() || !file2.isDirectory()) {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            FileChannel fileChannel = null;
            FileChannel fileChannel2 = null;
            try {
                fileInputStream = new FileInputStream(file);
                fileOutputStream = new FileOutputStream(file2);
                fileChannel = fileInputStream.getChannel();
                fileChannel2 = fileOutputStream.getChannel();
                long size = fileChannel.size();
                long j = 0;
                while (j < size) {
                    long j2 = size - j;
                    long transferFrom = fileChannel2.transferFrom(fileChannel, j, j2 > 31457280 ? 31457280L : j2);
                    if (transferFrom == 0) {
                        break;
                    }
                    j += transferFrom;
                }
                e.a(fileChannel2, fileOutputStream, fileChannel, fileInputStream);
                long length = file.length();
                long length2 = file2.length();
                if (length != length2) {
                    throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                }
                if (!z) {
                    return;
                }
                file2.setLastModified(file.lastModified());
                return;
            } catch (Throwable th) {
                e.a(fileChannel2, fileOutputStream, fileChannel, fileInputStream);
                throw th;
            }
        }
        throw new IOException("Destination '" + file2 + "' exists but is a directory");
    }

    private static void c(File file, File file2) {
        File[] listFiles;
        d(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        ArrayList arrayList = null;
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath()) && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            arrayList = new ArrayList(listFiles.length);
            for (File file3 : listFiles) {
                arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
            }
        }
        a(file, file2, null, true, arrayList);
    }

    private static void d(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean z, List list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        File[] fileArr = listFiles;
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : fileArr) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    a(file3, file4, fileFilter, z, list);
                } else {
                    a(file3, file4, z);
                }
            }
        }
        if (!z) {
            return;
        }
        file2.setLastModified(file.lastModified());
    }

    private static void b(File file) {
        boolean z;
        if (!file.exists()) {
            return;
        }
        if (f.a()) {
            z = f.a(file);
        } else if (file == null) {
            throw new NullPointerException("File must not be null");
        } else {
            if (d.a()) {
                z = false;
            } else {
                File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
                if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                    if (!file.exists()) {
                        File canonicalFile = file.getCanonicalFile();
                        File parentFile = canonicalFile.getParentFile();
                        if (parentFile == null || !parentFile.exists()) {
                            z = false;
                        } else {
                            File[] listFiles = parentFile.listFiles(new c(canonicalFile));
                            if (listFiles != null && listFiles.length > 0) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        if (!z) {
            c(file);
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Unable to delete directory " + file + ".");
    }

    public static boolean a(File file) {
        try {
            if (file.isDirectory()) {
                c(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    private static void c(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        File file2 = null;
        for (File file3 : listFiles) {
            try {
                if (file3.isDirectory()) {
                    b(file3);
                } else {
                    boolean exists = file3.exists();
                    if (!file3.delete()) {
                        if (exists) {
                            throw new IOException("Unable to delete file: " + file3);
                        }
                        throw new FileNotFoundException("File does not exist: " + file3);
                    }
                }
            } catch (IOException e2) {
                file2 = file3;
            }
        }
        if (file2 == null) {
            return;
        }
        throw file2;
    }

    public static void b(File file, File file2) {
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        }
        if (file2.exists()) {
            throw new a("Destination '" + file2 + "' already exists");
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
        c(file, file2);
        b(file);
        if (!file.exists()) {
            return;
        }
        throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        f43a = valueOf;
        f44b = valueOf.multiply(f43a);
        c = f43a.multiply(f44b);
        d = f43a.multiply(c);
        e = f43a.multiply(d);
        f43a.multiply(e);
        f = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f43a.multiply(f);
    }
}
