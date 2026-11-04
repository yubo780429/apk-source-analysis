package b.b.c.e;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import b.b.c.f.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Spannable f1065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0044a f1066c;
    private final PrecomputedText d;

    /* JADX INFO: renamed from: b.b.c.e.a$a, reason: collision with other inner class name */
    public static final class C0044a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f1067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f1068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1069c;
        private final int d;
        final PrecomputedText.Params e;

        /* JADX INFO: renamed from: b.b.c.e.a$a$a, reason: collision with other inner class name */
        public static class C0045a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f1070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f1071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f1072c;
            private int d;

            public C0045a(TextPaint textPaint) {
                this.f1070a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f1072c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.f1072c = 0;
                }
                this.f1071b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0045a a(int i) {
                this.f1072c = i;
                return this;
            }

            public C0045a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1071b = textDirectionHeuristic;
                return this;
            }

            public C0044a a() {
                return new C0044a(this.f1070a, this.f1071b, this.f1072c, this.d);
            }

            public C0045a b(int i) {
                this.d = i;
                return this;
            }
        }

        public C0044a(PrecomputedText.Params params) {
            this.f1067a = params.getTextPaint();
            this.f1068b = params.getTextDirection();
            this.f1069c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = params;
        }

        C0044a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.e = Build.VERSION.SDK_INT >= 28 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f1067a = textPaint;
            this.f1068b = textDirectionHeuristic;
            this.f1069c = i;
            this.d = i2;
        }

        public int a() {
            return this.f1069c;
        }

        public int b() {
            return this.d;
        }

        public TextDirectionHeuristic c() {
            return this.f1068b;
        }

        public TextPaint d() {
            return this.f1067a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0044a)) {
                return false;
            }
            C0044a c0044a = (C0044a) obj;
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(c0044a.e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f1069c != c0044a.a() || this.d != c0044a.b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f1068b != c0044a.c()) || this.f1067a.getTextSize() != c0044a.d().getTextSize() || this.f1067a.getTextScaleX() != c0044a.d().getTextScaleX() || this.f1067a.getTextSkewX() != c0044a.d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f1067a.getLetterSpacing() != c0044a.d().getLetterSpacing() || !TextUtils.equals(this.f1067a.getFontFeatureSettings(), c0044a.d().getFontFeatureSettings()))) || this.f1067a.getFlags() != c0044a.d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f1067a.getTextLocales().equals(c0044a.d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f1067a.getTextLocale().equals(c0044a.d().getTextLocale())) {
                return false;
            }
            if (this.f1067a.getTypeface() == null) {
                if (c0044a.d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f1067a.getTypeface().equals(c0044a.d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return i.a(Float.valueOf(this.f1067a.getTextSize()), Float.valueOf(this.f1067a.getTextScaleX()), Float.valueOf(this.f1067a.getTextSkewX()), Float.valueOf(this.f1067a.getLetterSpacing()), Integer.valueOf(this.f1067a.getFlags()), this.f1067a.getTextLocales(), this.f1067a.getTypeface(), Boolean.valueOf(this.f1067a.isElegantTextHeight()), this.f1068b, Integer.valueOf(this.f1069c), Integer.valueOf(this.d));
            }
            if (i >= 21) {
                return i.a(Float.valueOf(this.f1067a.getTextSize()), Float.valueOf(this.f1067a.getTextScaleX()), Float.valueOf(this.f1067a.getTextSkewX()), Float.valueOf(this.f1067a.getLetterSpacing()), Integer.valueOf(this.f1067a.getFlags()), this.f1067a.getTextLocale(), this.f1067a.getTypeface(), Boolean.valueOf(this.f1067a.isElegantTextHeight()), this.f1068b, Integer.valueOf(this.f1069c), Integer.valueOf(this.d));
            }
            if (i < 18 && i < 17) {
                return i.a(Float.valueOf(this.f1067a.getTextSize()), Float.valueOf(this.f1067a.getTextScaleX()), Float.valueOf(this.f1067a.getTextSkewX()), Integer.valueOf(this.f1067a.getFlags()), this.f1067a.getTypeface(), this.f1068b, Integer.valueOf(this.f1069c), Integer.valueOf(this.d));
            }
            return i.a(Float.valueOf(this.f1067a.getTextSize()), Float.valueOf(this.f1067a.getTextScaleX()), Float.valueOf(this.f1067a.getTextSkewX()), Integer.valueOf(this.f1067a.getFlags()), this.f1067a.getTextLocale(), this.f1067a.getTypeface(), this.f1068b, Integer.valueOf(this.f1069c), Integer.valueOf(this.d));
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00e3  */
        /* JADX WARN: Instruction removed from duplicated block: B:14:0x00e3, please report this as an issue */
        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f1067a.getTextSize());
            sb2.append(", textScaleX=" + this.f1067a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f1067a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb2.append(", letterSpacing=" + this.f1067a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f1067a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 24) {
                if (i >= 17) {
                    sb = new StringBuilder();
                    sb.append(", textLocale=");
                    textLocale = this.f1067a.getTextLocale();
                }
                sb2.append(", typeface=" + this.f1067a.getTypeface());
                if (Build.VERSION.SDK_INT >= 26) {
                    sb2.append(", variationSettings=" + this.f1067a.getFontVariationSettings());
                }
                sb2.append(", textDir=" + this.f1068b);
                sb2.append(", breakStrategy=" + this.f1069c);
                sb2.append(", hyphenationFrequency=" + this.d);
                sb2.append("}");
                return sb2.toString();
            }
            sb = new StringBuilder();
            sb.append(", textLocale=");
            textLocale = this.f1067a.getTextLocales();
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f1067a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb2.append(", variationSettings=" + this.f1067a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f1068b);
            sb2.append(", breakStrategy=" + this.f1069c);
            sb2.append(", hyphenationFrequency=" + this.d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C0044a a() {
        return this.f1066c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f1065b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f1065b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f1065b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f1065b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f1065b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.d.getSpans(i, i2, cls) : (T[]) this.f1065b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1065b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1065b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.removeSpan(obj);
        } else {
            this.f1065b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.setSpan(obj, i, i2, i3);
        } else {
            this.f1065b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f1065b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1065b.toString();
    }
}
