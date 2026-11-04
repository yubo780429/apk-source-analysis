package a.a.a.i;

import a.a.a.b.q;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f337a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f338b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f339c = null;
    public Map<String, Object> d = null;
    public byte[] e = null;
    public String f = null;
    public long g;

    public class a implements q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f340a;

        public a(long j) {
            this.f340a = j;
        }

        @Override // a.a.a.b.q.a
        public void a(int i, String str) {
            g gVar;
            boolean z;
            if (i == 200) {
                g.this.g = System.currentTimeMillis() - this.f340a;
                gVar = g.this;
                gVar.f339c = str;
                z = true;
            } else {
                gVar = g.this;
                gVar.f339c = null;
                z = false;
            }
            gVar.a(z);
        }

        @Override // a.a.a.b.q.a
        public void b(int i, String str) {
            g gVar = g.this;
            gVar.f339c = null;
            gVar.a(false);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f343c;

        public b(String str, boolean z) {
            this.f342b = str;
            this.f343c = z;
        }

        /* JADX WARN: Code duplicated, block: B:116:0x01c5 A[LOOP:0: B:3:0x001a->B:116:0x01c5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:120:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:135:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:136:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:143:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:161:0x01b6 A[EXC_TOP_SPLITTER, PHI: r11 r13
  0x01b6: PHI (r11v5 javax.net.ssl.HttpsURLConnection) = (r11v4 javax.net.ssl.HttpsURLConnection), (r11v7 javax.net.ssl.HttpsURLConnection) binds: [B:107:0x01b4, B:91:0x0190] A[DONT_GENERATE, DONT_INLINE]
  0x01b6: PHI (r13v3 java.io.ByteArrayOutputStream) = (r13v2 java.io.ByteArrayOutputStream), (r13v4 java.io.ByteArrayOutputStream) binds: [B:107:0x01b4, B:91:0x0190] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:178:0x01ec A[EDGE_INSN: B:178:0x01ec->B:134:0x01ec BREAK  A[LOOP:0: B:3:0x001a->B:116:0x01c5], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:181:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x017b  */
        /* JADX WARN: Code duplicated, block: B:98:0x019f  */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            OutputStream outputStream;
            OutputStream outputStream2;
            OutputStream outputStream3;
            InputStream inputStream;
            OutputStream outputStream4;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            boolean z;
            g gVar = g.this;
            gVar.f337a = a.a.a.i.d.f324b;
            gVar.a();
            HttpsURLConnection httpsURLConnection = null;
            for (int i = g.this.f338b; i > 0; i--) {
                try {
                    URL url = new URL(g.this.f337a);
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Map.Entry<String, Object> entry : g.this.d.entrySet()) {
                        stringBuffer.append(entry.getKey());
                        stringBuffer.append("=");
                        stringBuffer.append(entry.getValue());
                        stringBuffer.append("&");
                    }
                    if (stringBuffer.length() > 0) {
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    }
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
                    try {
                        httpsURLConnection2.setRequestMethod("POST");
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        httpsURLConnection2.setConnectTimeout(a.a.a.i.a.f316a);
                        httpsURLConnection2.setReadTimeout(a.a.a.i.a.f316a);
                        httpsURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                        httpsURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                        httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                        String str = i.o0;
                        if (str != null) {
                            httpsURLConnection2.setRequestProperty("bd-loc-android", str);
                        }
                        if (!TextUtils.isEmpty(this.f342b)) {
                            httpsURLConnection2.setRequestProperty("Host", this.f342b);
                        }
                        outputStream4 = httpsURLConnection2.getOutputStream();
                        try {
                            outputStream4.write(stringBuffer.toString().getBytes());
                            outputStream4.flush();
                            if (httpsURLConnection2.getResponseCode() == 200) {
                                inputStream = httpsURLConnection2.getInputStream();
                                try {
                                    String contentEncoding = httpsURLConnection2.getContentEncoding();
                                    if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                        inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i2 = inputStream.read(bArr);
                                                    if (i2 == -1) {
                                                        break;
                                                    } else {
                                                        byteArrayOutputStream.write(bArr, 0, i2);
                                                    }
                                                }
                                                g.this.f339c = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                                if (this.f343c) {
                                                    g.this.e = byteArrayOutputStream.toByteArray();
                                                }
                                                g.this.a(true);
                                                z = true;
                                            } catch (Error unused) {
                                                Log.d("baidu_location_service", "NetworkCommunicationError!");
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                if (outputStream4 != null) {
                                                    try {
                                                        outputStream4.close();
                                                    } catch (Exception unused2) {
                                                        Log.d("baidu_location_service", "close os IOException!");
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception unused3) {
                                                        Log.d("baidu_location_service", "close is IOException!");
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    try {
                                                        byteArrayOutputStream.close();
                                                    } catch (Exception unused4) {
                                                        z = false;
                                                        Log.d("baidu_location_service", "close baos IOException!");
                                                        httpsURLConnection = httpsURLConnection2;
                                                    }
                                                }
                                                httpsURLConnection = httpsURLConnection2;
                                                z = false;
                                            } catch (Exception unused5) {
                                                Log.d("baidu_location_service", "NetworkCommunicationException!");
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                if (outputStream4 != null) {
                                                    try {
                                                        outputStream4.close();
                                                    } catch (Exception unused6) {
                                                        Log.d("baidu_location_service", "close os IOException!");
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception unused7) {
                                                        Log.d("baidu_location_service", "close is IOException!");
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                httpsURLConnection = httpsURLConnection2;
                                                z = false;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream4 != null) {
                                                try {
                                                    outputStream4.close();
                                                } catch (Exception unused8) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused9) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream2 == null) {
                                                throw th;
                                            }
                                            try {
                                                byteArrayOutputStream2.close();
                                                throw th;
                                            } catch (Exception unused10) {
                                                Log.d("baidu_location_service", "close baos IOException!");
                                                throw th;
                                            }
                                        }
                                    } catch (Error unused11) {
                                        byteArrayOutputStream = null;
                                    } catch (Exception unused12) {
                                        byteArrayOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream2 = null;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream4 != null) {
                                            outputStream4.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream2 == null) {
                                            throw th;
                                        }
                                        byteArrayOutputStream2.close();
                                        throw th;
                                    }
                                } catch (Error unused13) {
                                    outputStream3 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream3;
                                    Log.d("baidu_location_service", "NetworkCommunicationError!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z = false;
                                    if (z) {
                                        break;
                                        if (i > 0) {
                                            g.h = 0;
                                            return;
                                        }
                                        g.h++;
                                        g gVar2 = g.this;
                                        gVar2.f339c = null;
                                        gVar2.a(false);
                                    }
                                } catch (Exception unused14) {
                                    outputStream2 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream2;
                                    Log.d("baidu_location_service", "NetworkCommunicationException!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z = false;
                                    if (z) {
                                        break;
                                        if (i > 0) {
                                            g.h = 0;
                                            return;
                                        }
                                        g.h++;
                                        g gVar3 = g.this;
                                        gVar3.f339c = null;
                                        gVar3.a(false);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    outputStream = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    outputStream4 = outputStream;
                                    byteArrayOutputStream2 = null;
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream2 == null) {
                                        throw th;
                                    }
                                    byteArrayOutputStream2.close();
                                    throw th;
                                }
                            } else {
                                z = false;
                                inputStream = null;
                                byteArrayOutputStream = null;
                            }
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (Exception unused15) {
                                    Log.d("baidu_location_service", "close os IOException!");
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused16) {
                                    Log.d("baidu_location_service", "close is IOException!");
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused17) {
                                    Log.d("baidu_location_service", "close baos IOException!");
                                }
                            }
                            httpsURLConnection = httpsURLConnection2;
                        } catch (Error unused18) {
                            outputStream3 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream3;
                            Log.d("baidu_location_service", "NetworkCommunicationError!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z = false;
                            if (z) {
                                break;
                                if (i > 0) {
                                    g.h = 0;
                                    return;
                                }
                                g.h++;
                                g gVar4 = g.this;
                                gVar4.f339c = null;
                                gVar4.a(false);
                            }
                        } catch (Exception unused19) {
                            outputStream2 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream2;
                            Log.d("baidu_location_service", "NetworkCommunicationException!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z = false;
                            if (z) {
                                break;
                                if (i > 0) {
                                    g.h = 0;
                                    return;
                                }
                                g.h++;
                                g gVar5 = g.this;
                                gVar5.f339c = null;
                                gVar5.a(false);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            outputStream4 = outputStream;
                            byteArrayOutputStream2 = null;
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 == null) {
                                throw th;
                            }
                            byteArrayOutputStream2.close();
                            throw th;
                        }
                    } catch (Error unused20) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream3 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream3;
                        Log.d("baidu_location_service", "NetworkCommunicationError!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z = false;
                        if (z) {
                            break;
                            if (i > 0) {
                                g.h = 0;
                                return;
                            }
                            g.h++;
                            g gVar6 = g.this;
                            gVar6.f339c = null;
                            gVar6.a(false);
                        }
                    } catch (Exception unused21) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream2 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream2;
                        Log.d("baidu_location_service", "NetworkCommunicationException!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z = false;
                        if (z) {
                            break;
                            if (i > 0) {
                                g.h = 0;
                                return;
                            }
                            g.h++;
                            g gVar7 = g.this;
                            gVar7.f339c = null;
                            gVar7.a(false);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpsURLConnection = httpsURLConnection2;
                        outputStream = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        outputStream4 = outputStream;
                        byteArrayOutputStream2 = null;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 == null) {
                            throw th;
                        }
                        byteArrayOutputStream2.close();
                        throw th;
                    }
                } catch (Error unused22) {
                } catch (Exception unused23) {
                } catch (Throwable th6) {
                    th = th6;
                }
                if (z) {
                    break;
                }
            }
            if (i > 0) {
                g.h = 0;
                return;
            }
            g.h++;
            g gVar8 = g.this;
            gVar8.f339c = null;
            gVar8.a(false);
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f345c;

        public c(String str, boolean z) {
            this.f344b = str;
            this.f345c = z;
        }

        /* JADX WARN: Code duplicated, block: B:116:0x01d4 A[LOOP:0: B:3:0x001a->B:116:0x01d4, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:120:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:135:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:136:0x020c  */
        /* JADX WARN: Code duplicated, block: B:143:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x01c5 A[EXC_TOP_SPLITTER, PHI: r12 r13
  0x01c5: PHI (r12v3 java.io.ByteArrayOutputStream) = (r12v2 java.io.ByteArrayOutputStream), (r12v4 java.io.ByteArrayOutputStream) binds: [B:107:0x01c3, B:91:0x019f] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r13v5 javax.net.ssl.HttpsURLConnection) = (r13v4 javax.net.ssl.HttpsURLConnection), (r13v7 javax.net.ssl.HttpsURLConnection) binds: [B:107:0x01c3, B:91:0x019f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:178:0x01fb A[EDGE_INSN: B:178:0x01fb->B:134:0x01fb BREAK  A[LOOP:0: B:3:0x001a->B:116:0x01d4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:181:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x018a  */
        /* JADX WARN: Code duplicated, block: B:98:0x01ae  */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            OutputStream outputStream;
            OutputStream outputStream2;
            OutputStream outputStream3;
            InputStream inputStream;
            OutputStream outputStream4;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            boolean z;
            g gVar = g.this;
            gVar.f337a = a.a.a.i.d.f324b;
            gVar.a();
            HttpsURLConnection httpsURLConnection = null;
            for (int i = g.this.f338b; i > 0; i--) {
                try {
                    HttpsURLConnection.setDefaultSSLSocketFactory(i.g());
                    URL url = new URL(g.this.f337a);
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Map.Entry<String, Object> entry : g.this.d.entrySet()) {
                        stringBuffer.append(entry.getKey());
                        stringBuffer.append("=");
                        stringBuffer.append(entry.getValue());
                        stringBuffer.append("&");
                    }
                    if (stringBuffer.length() > 0) {
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    }
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
                    try {
                        httpsURLConnection2.setRequestMethod("POST");
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        httpsURLConnection2.setConnectTimeout(a.a.a.i.a.f316a);
                        httpsURLConnection2.setReadTimeout(a.a.a.i.a.f316a);
                        httpsURLConnection2.setHostnameVerifier(new C0021g(url));
                        httpsURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                        httpsURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                        httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                        String str = i.o0;
                        if (str != null) {
                            httpsURLConnection2.setRequestProperty("bd-loc-android", str);
                        }
                        if (!TextUtils.isEmpty(this.f344b)) {
                            httpsURLConnection2.setRequestProperty("Host", this.f344b);
                        }
                        outputStream4 = httpsURLConnection2.getOutputStream();
                        try {
                            outputStream4.write(stringBuffer.toString().getBytes());
                            outputStream4.flush();
                            if (httpsURLConnection2.getResponseCode() == 200) {
                                inputStream = httpsURLConnection2.getInputStream();
                                try {
                                    String contentEncoding = httpsURLConnection2.getContentEncoding();
                                    if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                        inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i2 = inputStream.read(bArr);
                                                    if (i2 == -1) {
                                                        break;
                                                    } else {
                                                        byteArrayOutputStream.write(bArr, 0, i2);
                                                    }
                                                }
                                                g.this.f339c = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                                if (this.f345c) {
                                                    g.this.e = byteArrayOutputStream.toByteArray();
                                                }
                                                g.this.a(true);
                                                z = true;
                                            } catch (Error unused) {
                                                Log.d("baidu_location_service", "NetworkCommunicationError!");
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                if (outputStream4 != null) {
                                                    try {
                                                        outputStream4.close();
                                                    } catch (Exception unused2) {
                                                        Log.d("baidu_location_service", "close os IOException!");
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception unused3) {
                                                        Log.d("baidu_location_service", "close is IOException!");
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    try {
                                                        byteArrayOutputStream.close();
                                                    } catch (Exception unused4) {
                                                        z = false;
                                                        Log.d("baidu_location_service", "close baos IOException!");
                                                        httpsURLConnection = httpsURLConnection2;
                                                    }
                                                }
                                                httpsURLConnection = httpsURLConnection2;
                                                z = false;
                                            } catch (Exception unused5) {
                                                Log.d("baidu_location_service", "NetworkCommunicationException!");
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                if (outputStream4 != null) {
                                                    try {
                                                        outputStream4.close();
                                                    } catch (Exception unused6) {
                                                        Log.d("baidu_location_service", "close os IOException!");
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception unused7) {
                                                        Log.d("baidu_location_service", "close is IOException!");
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                httpsURLConnection = httpsURLConnection2;
                                                z = false;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream4 != null) {
                                                try {
                                                    outputStream4.close();
                                                } catch (Exception unused8) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused9) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream2 == null) {
                                                throw th;
                                            }
                                            try {
                                                byteArrayOutputStream2.close();
                                                throw th;
                                            } catch (Exception unused10) {
                                                Log.d("baidu_location_service", "close baos IOException!");
                                                throw th;
                                            }
                                        }
                                    } catch (Error unused11) {
                                        byteArrayOutputStream = null;
                                    } catch (Exception unused12) {
                                        byteArrayOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream2 = null;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream4 != null) {
                                            outputStream4.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream2 == null) {
                                            throw th;
                                        }
                                        byteArrayOutputStream2.close();
                                        throw th;
                                    }
                                } catch (Error unused13) {
                                    outputStream3 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream3;
                                    Log.d("baidu_location_service", "NetworkCommunicationError!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z = false;
                                    if (z) {
                                        break;
                                        if (i > 0) {
                                            g.h = 0;
                                            return;
                                        }
                                        g.h++;
                                        g gVar2 = g.this;
                                        gVar2.f339c = null;
                                        gVar2.a(false);
                                    }
                                } catch (Exception unused14) {
                                    outputStream2 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream2;
                                    Log.d("baidu_location_service", "NetworkCommunicationException!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z = false;
                                    if (z) {
                                        break;
                                        if (i > 0) {
                                            g.h = 0;
                                            return;
                                        }
                                        g.h++;
                                        g gVar3 = g.this;
                                        gVar3.f339c = null;
                                        gVar3.a(false);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    outputStream = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    outputStream4 = outputStream;
                                    byteArrayOutputStream2 = null;
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream2 == null) {
                                        throw th;
                                    }
                                    byteArrayOutputStream2.close();
                                    throw th;
                                }
                            } else {
                                z = false;
                                inputStream = null;
                                byteArrayOutputStream = null;
                            }
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (Exception unused15) {
                                    Log.d("baidu_location_service", "close os IOException!");
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused16) {
                                    Log.d("baidu_location_service", "close is IOException!");
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused17) {
                                    Log.d("baidu_location_service", "close baos IOException!");
                                }
                            }
                            httpsURLConnection = httpsURLConnection2;
                        } catch (Error unused18) {
                            outputStream3 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream3;
                            Log.d("baidu_location_service", "NetworkCommunicationError!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z = false;
                            if (z) {
                                break;
                                if (i > 0) {
                                    g.h = 0;
                                    return;
                                }
                                g.h++;
                                g gVar4 = g.this;
                                gVar4.f339c = null;
                                gVar4.a(false);
                            }
                        } catch (Exception unused19) {
                            outputStream2 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream2;
                            Log.d("baidu_location_service", "NetworkCommunicationException!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z = false;
                            if (z) {
                                break;
                                if (i > 0) {
                                    g.h = 0;
                                    return;
                                }
                                g.h++;
                                g gVar5 = g.this;
                                gVar5.f339c = null;
                                gVar5.a(false);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            outputStream4 = outputStream;
                            byteArrayOutputStream2 = null;
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 == null) {
                                throw th;
                            }
                            byteArrayOutputStream2.close();
                            throw th;
                        }
                    } catch (Error unused20) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream3 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream3;
                        Log.d("baidu_location_service", "NetworkCommunicationError!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z = false;
                        if (z) {
                            break;
                            if (i > 0) {
                                g.h = 0;
                                return;
                            }
                            g.h++;
                            g gVar6 = g.this;
                            gVar6.f339c = null;
                            gVar6.a(false);
                        }
                    } catch (Exception unused21) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream2 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream2;
                        Log.d("baidu_location_service", "NetworkCommunicationException!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z = false;
                        if (z) {
                            break;
                            if (i > 0) {
                                g.h = 0;
                                return;
                            }
                            g.h++;
                            g gVar7 = g.this;
                            gVar7.f339c = null;
                            gVar7.a(false);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpsURLConnection = httpsURLConnection2;
                        outputStream = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        outputStream4 = outputStream;
                        byteArrayOutputStream2 = null;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 == null) {
                            throw th;
                        }
                        byteArrayOutputStream2.close();
                        throw th;
                    }
                } catch (Error unused22) {
                } catch (Exception unused23) {
                } catch (Throwable th6) {
                    th = th6;
                }
                if (z) {
                    break;
                }
            }
            if (i > 0) {
                g.h = 0;
                return;
            }
            g.h++;
            g gVar8 = g.this;
            gVar8.f339c = null;
            gVar8.a(false);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f346b;

        public d(String str) {
            this.f346b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.b(this.f346b);
        }
    }

    public class e extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f348b;

        public e(String str) {
            this.f348b = str;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:121:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:135:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:138:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:172:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x019b  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 10, insn: 0x01e7: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:118:0x01e7 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ByteArrayOutputStream] */
        /* JADX WARN: Type inference failed for: r6v6 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            ?? r6;
            InputStream inputStream;
            OutputStream outputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            ?? r7;
            g.this.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            g.this.f337a = this.f348b;
            HttpsURLConnection httpsURLConnection2 = null;
            InputStream inputStream3 = null;
            try {
                try {
                    HttpsURLConnection.setDefaultSSLSocketFactory(i.g());
                    StringBuffer stringBuffer = new StringBuffer();
                    URL url = new URL(g.this.f337a);
                    try {
                        httpsURLConnection = (HttpsURLConnection) url.openConnection();
                        try {
                            httpsURLConnection.setInstanceFollowRedirects(false);
                            httpsURLConnection.setDoOutput(true);
                            httpsURLConnection.setDoInput(true);
                            httpsURLConnection.setConnectTimeout(a.a.a.i.a.f316a);
                            httpsURLConnection.setReadTimeout(a.a.a.i.a.f317b);
                            httpsURLConnection.setRequestMethod("POST");
                            httpsURLConnection.setHostnameVerifier(new C0021g(url));
                            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                            String str = g.this.f;
                            if (str != null) {
                                httpsURLConnection.setRequestProperty("alwd", str);
                            }
                            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            String str2 = i.o0;
                            if (str2 != null) {
                                httpsURLConnection.setRequestProperty("bd-loc-android", str2);
                            }
                            for (Map.Entry<String, Object> entry : g.this.d.entrySet()) {
                                stringBuffer.append(entry.getKey());
                                stringBuffer.append("=");
                                stringBuffer.append(entry.getValue());
                                stringBuffer.append("&");
                            }
                            if (stringBuffer.length() > 0) {
                                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                            }
                            outputStream = httpsURLConnection.getOutputStream();
                            try {
                                outputStream.write(stringBuffer.toString().getBytes());
                                outputStream.flush();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    inputStream = httpsURLConnection.getInputStream();
                                    try {
                                        g.this.g = System.currentTimeMillis() - jCurrentTimeMillis;
                                        String contentEncoding = httpsURLConnection.getContentEncoding();
                                        if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                            inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                        }
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i = inputStream.read(bArr);
                                                if (i == -1) {
                                                    break;
                                                } else {
                                                    byteArrayOutputStream.write(bArr, 0, i);
                                                }
                                            }
                                            g.this.f339c = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                            g.this.a(true);
                                            inputStream3 = inputStream;
                                        } catch (Error e) {
                                            e = e;
                                            e.printStackTrace();
                                            Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                            g gVar = g.this;
                                            gVar.f339c = null;
                                            gVar.a(false);
                                            if (httpsURLConnection != null) {
                                                httpsURLConnection.disconnect();
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception unused) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused2) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream == null) {
                                                return;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            e.printStackTrace();
                                            Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                            g gVar2 = g.this;
                                            gVar2.f339c = null;
                                            gVar2.a(false);
                                            if (httpsURLConnection != null) {
                                                httpsURLConnection.disconnect();
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception unused3) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused4) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream == null) {
                                                return;
                                            }
                                        }
                                    } catch (Error e3) {
                                        e = e3;
                                        byteArrayOutputStream = null;
                                        e.printStackTrace();
                                        Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                        g gVar3 = g.this;
                                        gVar3.f339c = null;
                                        gVar3.a(false);
                                        if (httpsURLConnection != null) {
                                            httpsURLConnection.disconnect();
                                        }
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream == null) {
                                            return;
                                        }
                                        byteArrayOutputStream.close();
                                    } catch (Exception e4) {
                                        e = e4;
                                        byteArrayOutputStream = null;
                                        e.printStackTrace();
                                        Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                        g gVar4 = g.this;
                                        gVar4.f339c = null;
                                        gVar4.a(false);
                                        if (httpsURLConnection != null) {
                                            httpsURLConnection.disconnect();
                                        }
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream == null) {
                                            return;
                                        }
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = 0;
                                        httpsURLConnection2 = httpsURLConnection;
                                        r6 = r7;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Exception unused5) {
                                                Log.d("baidu_location_service", "close os IOException!");
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused6) {
                                                Log.d("baidu_location_service", "close is IOException!");
                                            }
                                        }
                                        if (r6 != 0) {
                                            throw th;
                                        }
                                        try {
                                            r6.close();
                                            throw th;
                                        } catch (Exception unused7) {
                                            Log.d("baidu_location_service", "close baos IOException!");
                                            throw th;
                                        }
                                    }
                                } else {
                                    g gVar5 = g.this;
                                    gVar5.f339c = null;
                                    gVar5.a(false);
                                    byteArrayOutputStream = null;
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused8) {
                                        Log.d("baidu_location_service", "close os IOException!");
                                    }
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (Exception unused9) {
                                        Log.d("baidu_location_service", "close is IOException!");
                                    }
                                }
                                if (byteArrayOutputStream == null) {
                                    return;
                                }
                            } catch (Error e5) {
                                e = e5;
                                inputStream = null;
                            } catch (Exception e6) {
                                e = e6;
                                inputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                            }
                        } catch (Error e7) {
                            e = e7;
                            inputStream = null;
                            outputStream = null;
                        } catch (Exception e8) {
                            e = e8;
                            inputStream = null;
                            outputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            outputStream = null;
                        }
                    } catch (Error e9) {
                        e = e9;
                        inputStream = null;
                        outputStream = null;
                        httpsURLConnection = null;
                    } catch (Exception e10) {
                        e = e10;
                        inputStream = null;
                        outputStream = null;
                        httpsURLConnection = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        outputStream = null;
                        httpsURLConnection = null;
                    }
                } catch (Error e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                    inputStream = null;
                    outputStream = null;
                    httpsURLConnection = null;
                } catch (Exception e12) {
                    e = e12;
                    byteArrayOutputStream = null;
                    inputStream = null;
                    outputStream = null;
                    httpsURLConnection = null;
                } catch (Throwable th5) {
                    th = th5;
                    r6 = 0;
                    inputStream = null;
                    outputStream = null;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (r6 != 0) {
                        throw th;
                    }
                    r6.close();
                    throw th;
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused10) {
                    Log.d("baidu_location_service", "close baos IOException!");
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream = inputStream2;
                r7 = jCurrentTimeMillis;
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f350b;

        public f(String str) {
            this.f350b = str;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:122:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:138:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:175:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x017b  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            OutputStream outputStream;
            Exception e;
            ByteArrayOutputStream byteArrayOutputStream2;
            HttpsURLConnection httpsURLConnection;
            Error e2;
            String str = "gzip";
            g.this.a();
            g.this.f337a = this.f350b;
            HttpsURLConnection httpsURLConnection2 = null;
            InputStream inputStream2 = null;
            try {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    try {
                        httpsURLConnection = (HttpsURLConnection) new URL(g.this.f337a).openConnection();
                        try {
                            httpsURLConnection.setInstanceFollowRedirects(false);
                            httpsURLConnection.setDoOutput(true);
                            httpsURLConnection.setDoInput(true);
                            httpsURLConnection.setConnectTimeout(a.a.a.i.a.f316a);
                            httpsURLConnection.setReadTimeout(a.a.a.i.a.f317b);
                            httpsURLConnection.setRequestMethod("POST");
                            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            String str2 = i.o0;
                            if (str2 != null) {
                                httpsURLConnection.setRequestProperty("bd-loc-android", str2);
                            }
                            for (Map.Entry<String, Object> entry : g.this.d.entrySet()) {
                                stringBuffer.append(entry.getKey());
                                stringBuffer.append("=");
                                stringBuffer.append(entry.getValue());
                                stringBuffer.append("&");
                            }
                            if (stringBuffer.length() > 0) {
                                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                            }
                            outputStream = httpsURLConnection.getOutputStream();
                            try {
                                outputStream.write(stringBuffer.toString().getBytes());
                                outputStream.flush();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    inputStream = httpsURLConnection.getInputStream();
                                    try {
                                        try {
                                            String contentEncoding = httpsURLConnection.getContentEncoding();
                                            if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                                inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                            }
                                            try {
                                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                try {
                                                    byte[] bArr = new byte[1024];
                                                    while (true) {
                                                        int i = inputStream.read(bArr);
                                                        if (i == -1) {
                                                            break;
                                                        } else {
                                                            byteArrayOutputStream2.write(bArr, 0, i);
                                                        }
                                                    }
                                                    g.this.f339c = new String(byteArrayOutputStream2.toByteArray(), "utf-8");
                                                    g.this.a(true);
                                                    inputStream2 = inputStream;
                                                } catch (Error e3) {
                                                    e2 = e3;
                                                    e2.printStackTrace();
                                                    Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                                    g gVar = g.this;
                                                    gVar.f339c = null;
                                                    gVar.a(false);
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    if (outputStream != null) {
                                                        try {
                                                            outputStream.close();
                                                        } catch (Exception unused) {
                                                            Log.d("baidu_location_service", "close os IOException!");
                                                        }
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Exception unused2) {
                                                            Log.d("baidu_location_service", "close is IOException!");
                                                        }
                                                    }
                                                    if (byteArrayOutputStream2 == null) {
                                                        return;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    e.printStackTrace();
                                                    Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                                    g gVar2 = g.this;
                                                    gVar2.f339c = null;
                                                    gVar2.a(false);
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    if (outputStream != null) {
                                                        try {
                                                            outputStream.close();
                                                        } catch (Exception unused3) {
                                                            Log.d("baidu_location_service", "close os IOException!");
                                                        }
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Exception unused4) {
                                                            Log.d("baidu_location_service", "close is IOException!");
                                                        }
                                                    }
                                                    if (byteArrayOutputStream2 == null) {
                                                        return;
                                                    }
                                                }
                                            } catch (Error e5) {
                                                e = e5;
                                                e2 = e;
                                                byteArrayOutputStream2 = null;
                                                e2.printStackTrace();
                                                Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                                g gVar3 = g.this;
                                                gVar3.f339c = null;
                                                gVar3.a(false);
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                                if (outputStream != null) {
                                                    outputStream.close();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream2 == null) {
                                                    return;
                                                }
                                                byteArrayOutputStream2.close();
                                            } catch (Exception e6) {
                                                e = e6;
                                                e = e;
                                                byteArrayOutputStream2 = null;
                                                e.printStackTrace();
                                                Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                                g gVar4 = g.this;
                                                gVar4.f339c = null;
                                                gVar4.a(false);
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                                if (outputStream != null) {
                                                    outputStream.close();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream2 == null) {
                                                    return;
                                                }
                                                byteArrayOutputStream2.close();
                                            }
                                        } catch (Error e7) {
                                            e = e7;
                                        } catch (Exception e8) {
                                            e = e8;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        str = null;
                                        httpsURLConnection2 = httpsURLConnection;
                                        byteArrayOutputStream = str;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Exception unused5) {
                                                Log.d("baidu_location_service", "close os IOException!");
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused6) {
                                                Log.d("baidu_location_service", "close is IOException!");
                                            }
                                        }
                                        if (byteArrayOutputStream != 0) {
                                            throw th;
                                        }
                                        try {
                                            byteArrayOutputStream.close();
                                            throw th;
                                        } catch (Exception unused7) {
                                            Log.d("baidu_location_service", "close baos IOException!");
                                            throw th;
                                        }
                                    }
                                } else {
                                    g gVar5 = g.this;
                                    gVar5.f339c = null;
                                    gVar5.a(false);
                                    byteArrayOutputStream2 = null;
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused8) {
                                        Log.d("baidu_location_service", "close os IOException!");
                                    }
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception unused9) {
                                        Log.d("baidu_location_service", "close is IOException!");
                                    }
                                }
                                if (byteArrayOutputStream2 == null) {
                                    return;
                                }
                            } catch (Error e9) {
                                e = e9;
                                inputStream = null;
                            } catch (Exception e10) {
                                e = e10;
                                inputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                            }
                        } catch (Error e11) {
                            e = e11;
                            inputStream = null;
                            outputStream = null;
                        } catch (Exception e12) {
                            e = e12;
                            inputStream = null;
                            outputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            outputStream = null;
                        }
                    } catch (Error e13) {
                        e = e13;
                        inputStream = null;
                        httpsURLConnection = null;
                        outputStream = null;
                    } catch (Exception e14) {
                        e = e14;
                        inputStream = null;
                        httpsURLConnection = null;
                        outputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        httpsURLConnection = null;
                        outputStream = null;
                    }
                } catch (Error e15) {
                    e2 = e15;
                    byteArrayOutputStream2 = null;
                    inputStream = null;
                    httpsURLConnection = null;
                    outputStream = null;
                } catch (Exception e16) {
                    e = e16;
                    byteArrayOutputStream2 = null;
                    inputStream = null;
                    httpsURLConnection = null;
                    outputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = 0;
                    inputStream = null;
                    outputStream = null;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream != 0) {
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception unused10) {
                    Log.d("baidu_location_service", "close baos IOException!");
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: renamed from: a.a.a.i.g$g, reason: collision with other inner class name */
    public static class C0021g implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f352a;

        public C0021g(URL url) {
            this.f352a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f352a.getHost().equals(str);
        }
    }

    static {
        int i = a.a.a.i.a.f318c;
        h = 0;
    }

    public abstract void a();

    public void a(String str) {
        if (a.a.a.b.d.i().N != 1) {
            try {
                new e(str).start();
            } catch (Throwable unused) {
                a(false);
            }
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            new Thread(new d(str)).start();
        } else {
            b(str);
        }
    }

    public void a(ExecutorService executorService, String str) {
        try {
            executorService.execute(new f(str));
        } catch (Throwable unused) {
            a(false);
        }
    }

    public void a(ExecutorService executorService, boolean z, String str) {
        try {
            executorService.execute(new b(str, z));
        } catch (Throwable unused) {
            a(false);
        }
    }

    public abstract void a(boolean z);

    public void a(boolean z, String str) {
        try {
            new c(str, z).start();
        } catch (Throwable unused) {
            a(false);
        }
    }

    public final void b(String str) {
        q qVarC;
        String str2;
        a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f != null) {
            qVarC = q.c();
            str2 = this.f;
        } else {
            qVarC = q.c();
            str2 = null;
        }
        qVarC.a(str2);
        q.c().a(this.d, str, new a(jCurrentTimeMillis));
    }
}
