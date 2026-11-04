package c.a.c.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1302a;
    private String e;
    private String g;
    private String h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f1303b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f1304c = null;
    private String d = null;
    private int f = -1;

    public k(Context context) {
        this.f1302a = context;
    }

    private String a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT < 29) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (extraInfo == null) {
                        return "wifi";
                    }
                    if (extraInfo.trim().toLowerCase().equals("cmwap") || extraInfo.trim().toLowerCase().equals("uniwap") || extraInfo.trim().toLowerCase().equals("3gwap") || extraInfo.trim().toLowerCase().equals("ctwap")) {
                        return extraInfo.trim().toLowerCase().equals("ctwap") ? "ctwap" : "cmwap";
                    }
                    return "wifi";
                }
                return null;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "wifi";
            }
            boolean zHasTransport = networkCapabilities.hasTransport(1);
            boolean zHasTransport2 = networkCapabilities.hasTransport(0);
            boolean zHasTransport3 = networkCapabilities.hasTransport(3);
            boolean zHasTransport4 = networkCapabilities.hasTransport(6);
            boolean zHasTransport5 = networkCapabilities.hasTransport(4);
            boolean zHasTransport6 = networkCapabilities.hasTransport(5);
            if (zHasTransport) {
                return "WIFI";
            }
            if (zHasTransport2) {
                return "CELLULAR";
            }
            if (zHasTransport3) {
                return "ETHERNET";
            }
            if (zHasTransport4) {
                return "LoWPAN";
            }
            if (zHasTransport5) {
                return "VPN";
            }
            return zHasTransport6 ? "WifiAware" : "wifi";
        } catch (Exception e) {
            if (d.f1289a) {
                e.printStackTrace();
            }
            return null;
        }
    }

    private static String a(HashMap map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0160 A[PHI: r14
  0x0160: PHI (r14v14 'e' java.io.IOException) = (r14v8 'e' java.io.IOException), (r14v13 'e' java.io.IOException), (r14v19 'e' java.io.IOException) binds: [B:100:0x015e, B:113:0x018f, B:126:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x016a A[Catch: all -> 0x012e, TryCatch #9 {all -> 0x012e, blocks: (B:7:0x002f, B:91:0x0133, B:93:0x0137, B:94:0x013a, B:104:0x0166, B:106:0x016a, B:107:0x016d, B:117:0x0194, B:119:0x0198, B:120:0x019b), top: B:148:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0198 A[Catch: all -> 0x012e, TryCatch #9 {all -> 0x012e, blocks: (B:7:0x002f, B:91:0x0133, B:93:0x0137, B:94:0x013a, B:104:0x0166, B:106:0x016a, B:107:0x016d, B:117:0x0194, B:119:0x0198, B:120:0x019b), top: B:148:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0202  */
    /* JADX WARN: Code duplicated, block: B:149:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2 A[Catch: all -> 0x0107, TryCatch #3 {all -> 0x0107, blocks: (B:45:0x00ae, B:47:0x00b2, B:48:0x00cd), top: B:146:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2 A[Catch: Exception -> 0x0118, IOException -> 0x011a, MalformedURLException -> 0x011c, all -> 0x011e, TRY_LEAVE, TryCatch #22 {all -> 0x011e, blocks: (B:8:0x0033, B:66:0x010c, B:68:0x0114, B:69:0x0117, B:51:0x00ea, B:53:0x00f2, B:29:0x0090, B:31:0x0098), top: B:155:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0114 A[Catch: Exception -> 0x0118, IOException -> 0x011a, MalformedURLException -> 0x011c, all -> 0x011e, TryCatch #22 {all -> 0x011e, blocks: (B:8:0x0033, B:66:0x010c, B:68:0x0114, B:69:0x0117, B:51:0x00ea, B:53:0x00f2, B:29:0x0090, B:31:0x0098), top: B:155:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0137 A[Catch: all -> 0x012e, TryCatch #9 {all -> 0x012e, blocks: (B:7:0x002f, B:91:0x0133, B:93:0x0137, B:94:0x013a, B:104:0x0166, B:106:0x016a, B:107:0x016d, B:117:0x0194, B:119:0x0198, B:120:0x019b), top: B:148:0x002f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x0202, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00b2, please report this as an issue */
    private void a(HttpsURLConnection httpsURLConnection) throws Throwable {
        BufferedReader bufferedReader;
        d.a("https Post start,url:" + this.f1303b);
        if (this.f1304c == null) {
            this.d = a.a("httpsPost request paramters is null.");
            return;
        }
        boolean z = true;
        int responseCode = -1;
        OutputStream outputStream = null;
        BufferedReader bufferedReader2 = null;
        inputStream = null;
        InputStream inputStream = null;
        OutputStream outputStream2 = null;
        OutputStream outputStream3 = null;
        OutputStream outputStream4 = null;
        boolean z2 = false;
        try {
            try {
                OutputStream outputStream5 = httpsURLConnection.getOutputStream();
                try {
                    try {
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream5, "UTF-8"));
                            bufferedWriter.write(a(this.f1304c));
                            d.a(a(this.f1304c));
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            httpsURLConnection.connect();
                            try {
                                InputStream inputStream2 = httpsURLConnection.getInputStream();
                                try {
                                    responseCode = httpsURLConnection.getResponseCode();
                                    if (200 == responseCode) {
                                        try {
                                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                            try {
                                                StringBuffer stringBuffer = new StringBuffer();
                                                while (true) {
                                                    int i = bufferedReader.read();
                                                    if (i == responseCode) {
                                                        break;
                                                    } else {
                                                        stringBuffer.append((char) i);
                                                    }
                                                }
                                                this.d = stringBuffer.toString();
                                                bufferedReader2 = bufferedReader;
                                            } catch (IOException e) {
                                                e = e;
                                                inputStream = inputStream2;
                                                try {
                                                    if (d.f1289a) {
                                                        e.printStackTrace();
                                                        d.a("httpsPost parse failed;" + e.getMessage());
                                                    }
                                                    this.d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                                    if (inputStream != null && bufferedReader != null) {
                                                        bufferedReader.close();
                                                        inputStream.close();
                                                    }
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    z = false;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (inputStream != null && bufferedReader != null) {
                                                        bufferedReader.close();
                                                        inputStream.close();
                                                    }
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                if (inputStream != null) {
                                                    bufferedReader.close();
                                                    inputStream.close();
                                                }
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e2) {
                                            e = e2;
                                            bufferedReader = null;
                                            inputStream = inputStream2;
                                            if (d.f1289a) {
                                                e.printStackTrace();
                                                d.a("httpsPost parse failed;" + e.getMessage());
                                            }
                                            this.d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                            if (inputStream != null) {
                                                bufferedReader.close();
                                                inputStream.close();
                                            }
                                            if (httpsURLConnection != null) {
                                                httpsURLConnection.disconnect();
                                            }
                                            z = false;
                                            if (outputStream5 != null) {
                                                try {
                                                    outputStream5.close();
                                                } catch (IOException e3) {
                                                    if (d.f1289a) {
                                                        e3.printStackTrace();
                                                    }
                                                }
                                            }
                                            z2 = z;
                                            if (z2) {
                                            }
                                            if (this.d == null) {
                                                d.a("httpsPost failed,mResult is null");
                                                this.d = a.a(responseCode, "httpsPost failed,internal error");
                                                return;
                                            } else {
                                                d.a("httpsPost success end,parse result = " + this.d);
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedReader = null;
                                            inputStream = inputStream2;
                                            if (inputStream != null) {
                                                bufferedReader.close();
                                                inputStream.close();
                                            }
                                            if (httpsURLConnection != null) {
                                                httpsURLConnection.disconnect();
                                            }
                                            throw th;
                                        }
                                    }
                                    if (inputStream2 != null && bufferedReader2 != null) {
                                        bufferedReader2.close();
                                        inputStream2.close();
                                    }
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    responseCode = responseCode;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (IOException e5) {
                                e = e5;
                                responseCode = responseCode;
                                bufferedReader = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = null;
                            }
                            if (outputStream5 != null) {
                                outputStream5.close();
                            }
                            z2 = z;
                        } catch (MalformedURLException e6) {
                            e = e6;
                            outputStream3 = outputStream5;
                            if (d.f1289a) {
                                e.printStackTrace();
                            }
                            this.d = a.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e7) {
                                    e = e7;
                                    if (d.f1289a) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } catch (IOException e8) {
                            e = e8;
                            outputStream4 = outputStream5;
                            if (d.f1289a) {
                                e.printStackTrace();
                            }
                            this.d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e9) {
                                    e = e9;
                                    if (d.f1289a) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            outputStream = outputStream5;
                            if (d.f1289a) {
                                e.printStackTrace();
                            }
                            this.d = a.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e11) {
                                    e = e11;
                                    if (d.f1289a) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    } catch (MalformedURLException e12) {
                        e = e12;
                        outputStream3 = outputStream5;
                        if (d.f1289a) {
                            e.printStackTrace();
                        }
                        this.d = a.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                    } catch (IOException e13) {
                        e = e13;
                        outputStream4 = outputStream5;
                        if (d.f1289a) {
                            e.printStackTrace();
                        }
                        this.d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                    } catch (Exception e14) {
                        e = e14;
                        outputStream = outputStream5;
                        if (d.f1289a) {
                            e.printStackTrace();
                        }
                        this.d = a.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    }
                    if (z2 || 200 == responseCode) {
                        if (this.d == null) {
                            d.a("httpsPost failed,mResult is null");
                            this.d = a.a(responseCode, "httpsPost failed,internal error");
                            return;
                        } else {
                            d.a("httpsPost success end,parse result = " + this.d);
                            return;
                        }
                    }
                    d.a("httpsPost failed,statusCode:" + responseCode);
                    this.d = a.a(-11, "httpsPost failed,statusCode:" + responseCode);
                } catch (Throwable th6) {
                    th = th6;
                    outputStream2 = outputStream5;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e15) {
                            if (d.f1289a) {
                                e15.printStackTrace();
                            }
                        }
                    }
                    throw th;
                }
            } catch (MalformedURLException e16) {
                e = e16;
            } catch (IOException e17) {
                e = e17;
            } catch (Exception e18) {
                e = e18;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private HashMap b(HashMap map) {
        HashMap map2 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String string = ((String) it.next()).toString();
            map2.put(string, map.get(string));
        }
        return map2;
    }

    private HttpsURLConnection b() {
        String str;
        URLConnection uRLConnectionOpenConnection;
        try {
            URL url = new URL(this.f1303b);
            d.a("https URL: " + this.f1303b);
            String strA = a(this.f1302a);
            if (strA != null && !strA.equals("")) {
                if (TextUtils.isEmpty(this.e) || this.f == -1) {
                    d.a("checkNetwork = " + strA);
                    if ("cmwap".equals(strA)) {
                        uRLConnectionOpenConnection = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80)));
                    } else {
                        uRLConnectionOpenConnection = "ctwap".equals(strA) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection();
                    }
                } else {
                    d.a("Proxy mProxyHost: = " + this.e + " mProxyPort: " + this.f);
                    Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(this.e, this.f));
                    Authenticator.setDefault(new l(this));
                    uRLConnectionOpenConnection = url.openConnection(proxy);
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setHostnameVerifier(new m(this));
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setConnectTimeout(50000);
                httpsURLConnection.setReadTimeout(50000);
                return httpsURLConnection;
            }
            d.c("Current network is not available.");
            this.d = a.a(-10, "Current network is not available.");
            return null;
        } catch (MalformedURLException e) {
            if (d.f1289a) {
                e.printStackTrace();
                d.a(e.getMessage());
            }
            str = "Auth server could not be parsed as a URL.";
            this.d = a.a(-11, str);
            return null;
        } catch (Exception e2) {
            if (d.f1289a) {
                e2.printStackTrace();
                d.a(e2.getMessage());
            }
            str = "Init httpsurlconnection failed.";
            this.d = a.a(-11, str);
            return null;
        }
    }

    protected String a(HashMap map, String str, int i, String str2, String str3) throws Throwable {
        HashMap mapB = b(map);
        this.f1304c = mapB;
        this.f1303b = (String) mapB.get("url");
        this.e = str;
        this.f = i;
        this.g = str2;
        this.h = str3;
        HttpsURLConnection httpsURLConnectionB = b();
        if (httpsURLConnectionB == null) {
            d.c("syncConnect failed,httpsURLConnection is null");
        } else {
            a(httpsURLConnectionB);
        }
        return this.d;
    }

    protected boolean a() {
        d.a("checkNetwork start");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f1302a.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            d.a("checkNetwork end");
            return true;
        } catch (Exception e) {
            if (d.f1289a) {
                e.printStackTrace();
            }
            return false;
        }
    }
}
