package com.example.modelstoreapp.view.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modelstoreapp.R
import com.example.modelstoreapp.databinding.FragmentSecondBinding
import com.example.modelstoreapp.view.viewmanager.SimilarMoviesGnrAdapter
import com.example.modelstoreapp.viewmodel.DetailViewModel
import com.example.modelstoreapp.viewmodel.MainViewModel

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding ?= null
    private lateinit var mainViewModel: MainViewModel
    private lateinit var detailViewModel: DetailViewModel
    private lateinit var similarMoviesAdapter: SimilarMoviesGnrAdapter
    private lateinit var navController: NavController
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        navController = Navigation.findNavController(requireActivity(),R.id.nav_host_fragment_content_main)
        detailViewModel = ViewModelProvider(requireActivity()).get(DetailViewModel::class.java)
        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        mainViewModel.genreSharing.observe(requireActivity(), Observer {
              detailViewModel.showSimilarMByG(it.id)
        })
        getMovieList()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun getMovieList(){
        similarMoviesAdapter = SimilarMoviesGnrAdapter()
        detailViewModel.getMovieByGnr.observe(requireActivity(), Observer {similarList->
            similarList?.let {
                binding.apply {
                    this.movieList.layoutManager = LinearLayoutManager(requireContext())
                    this.movieList.adapter = similarMoviesAdapter
                }
                similarMoviesAdapter.showSimilarItems(it)
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }
    override fun onDetach() {
        super.onDetach()
    }
    override fun onResume() {
        super.onResume()
    }
}