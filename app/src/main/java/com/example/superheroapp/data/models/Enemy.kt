package com.example.superheroapp.data.models

import android.os.Parcel
import android.os.Parcelable

data class Enemy(
    val id: Int,
    val name: String,
    val photo: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeInt(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Enemy> {
        override fun createFromParcel(parcel: Parcel): Enemy {
            return Enemy(parcel)
        }

        override fun newArray(size: Int): Array<Enemy?> {
            return arrayOfNulls(size)
        }
    }
}

