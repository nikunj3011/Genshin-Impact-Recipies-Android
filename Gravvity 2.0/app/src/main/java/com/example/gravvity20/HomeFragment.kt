package com.example.gravvity20

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {
    private val favFragment = FavFragment()
    lateinit var bottomNav : BottomNavigationView
    private var ctx: Context? = null
    private var bDaButton: ImageView? = null
    private var self: View? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        ctx = container?.context
        self = LayoutInflater.from(ctx).inflate(R.layout.fragment_home, container, false)
        bDaButton = self?.findViewById<ImageView>(R.id.imageButton)
        bDaButton?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_favFragment)
        }
        return self
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        bDaButton?.setOnClickListener {
//            val action =
//                HomeFragmentDirections.actionHomeFragmentToFavFragment()
//            view.findNavController().navigate(action)
////            findNavController().navigate(R.id.action_homeFragment_to_favFragment)
//        }
//    }
}