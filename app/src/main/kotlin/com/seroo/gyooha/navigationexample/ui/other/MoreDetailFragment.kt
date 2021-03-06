package com.seroo.gyooha.navigationexample.ui.other

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroo.gyooha.navigationexample.R
import kotlinx.android.synthetic.main.fragment_more_detail.*

class MoreDetailFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_more_detail, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_fragment_more_detail.setOnClickListener { Navigation.findNavController(it).navigate(R.id.deepDetailFragment) }
    }
}
