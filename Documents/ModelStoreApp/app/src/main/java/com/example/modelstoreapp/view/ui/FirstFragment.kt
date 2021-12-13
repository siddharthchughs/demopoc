package com.example.modelstoreapp.view.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modelstoreapp.R
import com.example.modelstoreapp.databinding.FragmentFirstBinding
import com.example.modelstoreapp.model.genremodel.Genre
import com.example.modelstoreapp.view.viewmanager.GenreAdapter
import com.example.modelstoreapp.viewmodel.MainViewModel

class FirstFragment : Fragment(),GenreAdapter.onMovieSelectItem {

    private var _binding: FragmentFirstBinding ?= null
    private lateinit var navigateController : NavController
    private lateinit var genreAdapter: GenreAdapter
    lateinit var mainViewModel: MainViewModel
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        navigateController = Navigation.findNavController(requireActivity(),R.id.nav_host_fragment_content_main)
        showGenreList()
        return binding.root
    }

/*The code from the line no : 111-120 is showing the list of Genre for
 the movies.
*/
fun showGenreList(){
    genreAdapter = GenreAdapter(this)
    mainViewModel.getGenreData.observe(requireActivity(), Observer { movieList ->
        movieList?.let {
            binding.apply {
                this.movieList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                this.movieList.adapter = genreAdapter
                genreAdapter.showGenreItems(it)
            }
        }
    })
}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onMovieSelectClickEvent(position: Int,movieGenre: Genre) {
        binding.tvMovieTitle.text = movieGenre.name
        mainViewModel.genreSharing.value = movieGenre
    }
}