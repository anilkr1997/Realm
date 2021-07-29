package app.androidhive.info.realm.adapters;

import android.content.Context;

import app.androidhive.info.realm.activity.MainActivity;
import app.androidhive.info.realm.model.Book;
import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(MainActivity mainActivity, RealmResults<Book> realmResults, boolean b) {

        super(realmResults );
    }
}