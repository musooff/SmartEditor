package com.ballboycorp.anappaday.smarteditorretouched.options

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ballboycorp.anappaday.smarteditorretouched.databinding.FragmentTextAlignBinding

/**
 * Created by musooff on 2019-09-15.
 */

class TextAlignFragment : Fragment() {


    private var textAlign = 1


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTextAlignBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}