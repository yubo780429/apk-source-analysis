package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
class e extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f651a;

    interface a {
        Cursor a();

        Cursor a(CharSequence charSequence);

        CharSequence a(Cursor cursor);

        void b(Cursor cursor);
    }

    e(a aVar) {
        this.f651a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f651a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorA = this.f651a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorA != null) {
            filterResults.count = cursorA.getCount();
        } else {
            filterResults.count = 0;
            cursorA = null;
        }
        filterResults.values = cursorA;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorA = this.f651a.a();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorA) {
            return;
        }
        this.f651a.b((Cursor) obj);
    }
}
