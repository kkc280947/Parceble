package com.example.kris.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kris on 08/02/17.
 */

public class Model implements Parcelable {
    int id;String name;
    protected Model(Parcel in) {
        this.id=in.readInt();
        this.name=in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public Model(String name, int id) {
        this.name=name;
        this.id=id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
    }
}
