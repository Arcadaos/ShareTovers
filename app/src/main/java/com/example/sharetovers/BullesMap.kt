package com.example.sharetovers

import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.clustering.ClusterItem

class BullesMap(lat: Double, lng: Double, title: String, snippet: String) : ClusterItem {

    private val position: LatLng
    private val title: String
    private val snippet: String

    override fun getPosition(): LatLng {
        return position
    }

    fun getTitle(): String? {
        return title
    }

    fun getSnippet(): String? {
        return snippet
    }

    init {
        position = LatLng(lat, lng)
        this.title = title
        this.snippet = snippet
    }
}

