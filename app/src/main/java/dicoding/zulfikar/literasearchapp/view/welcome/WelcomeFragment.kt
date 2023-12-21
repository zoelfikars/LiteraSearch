package dicoding.zulfikar.literasearchapp.view.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dicoding.zulfikar.literasearchapp.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAction()
    }

    private fun setupAction() {
        with(binding) {
            binding.buttonLanjut.setOnClickListener{
                val mover = WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment()
                findNavController().navigate(mover)
            }
            binding.textGuest.setOnClickListener {
                val mover = WelcomeFragmentDirections.actionWelcomeFragmentToBookFragment2()
                findNavController().navigate(mover)
            }
        }
    }
}