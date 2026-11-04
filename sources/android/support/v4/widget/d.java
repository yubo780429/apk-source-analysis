package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BaseAdapter implements Filterable, e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f648c;
    protected Cursor d;
    protected Context e;
    protected int f;
    protected a g;
    protected DataSetObserver h;
    protected e i;

    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            d.this.b();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            d dVar = d.this;
            dVar.f647b = true;
            dVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            d dVar = d.this;
            dVar.f647b = false;
            dVar.notifyDataSetInvalidated();
        }
    }

    public d(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    @Override // android.support.v4.widget.e.a
    public Cursor a() {
        return this.d;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.support.v4.widget.e.a
    public abstract CharSequence a(Cursor cursor);

    void a(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.f648c = true;
        } else {
            this.f648c = false;
        }
        boolean z = cursor != null;
        this.d = cursor;
        this.f647b = z;
        this.e = context;
        this.f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z) {
            a aVar = this.g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void b() {
        Cursor cursor;
        if (!this.f648c || (cursor = this.d) == null || cursor.isClosed()) {
            return;
        }
        this.f647b = this.d.requery();
    }

    @Override // android.support.v4.widget.e.a
    public void b(Cursor cursor) {
        Cursor cursorC = c(cursor);
        if (cursorC != null) {
            cursorC.close();
        }
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor != null) {
            a aVar2 = this.g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f = cursor.getColumnIndexOrThrow("_id");
            this.f647b = true;
            notifyDataSetChanged();
        } else {
            this.f = -1;
            this.f647b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f647b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f647b) {
            return null;
        }
        this.d.moveToPosition(i);
        if (view == null) {
            view = a(this.e, this.d, viewGroup);
        }
        a(view, this.e, this.d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new e(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f647b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f647b && (cursor = this.d) != null && cursor.moveToPosition(i)) {
            return this.d.getLong(this.f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f647b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.d.moveToPosition(i)) {
            if (view == null) {
                view = b(this.e, this.d, viewGroup);
            }
            a(view, this.e, this.d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }
}
