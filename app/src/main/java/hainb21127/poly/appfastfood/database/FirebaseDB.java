package hainb21127.poly.appfastfood.database;

import com.google.firebase.database.FirebaseDatabase;

import hainb21127.poly.appfastfood.url.URL;

public class FirebaseDB {
    public static FirebaseDatabase firebaseDatabase;

    public static FirebaseDatabase getDatabaseInstance(){
        if(firebaseDatabase == null)
            firebaseDatabase = FirebaseDatabase.getInstance(URL.URL_API);
        return firebaseDatabase;
    }
}
