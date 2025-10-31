package com.example.myapplication96

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Menghubungkan fragment ke layout XML-nya
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }
}
