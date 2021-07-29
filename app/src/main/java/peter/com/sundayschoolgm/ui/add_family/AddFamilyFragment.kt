package peter.com.sundayschoolgm.ui.add_family

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import peter.com.sundayschoolgm.databinding.FragmentAddFamilyBinding

class AddFamilyFragment : Fragment() {
    private lateinit var viewModel: AddFamilyViewModel
    private lateinit var binding: FragmentAddFamilyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddFamilyBinding.inflate(inflater)
        viewModel = ViewModelProviders.of(this).get(AddFamilyViewModel::class.java)
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)
        viewModel.show.observe(this, Observer { b ->
            if (b)
                viewModel.family.value.let{
                    Toast.makeText(context, viewModel.family.value?.name,Toast.LENGTH_SHORT).show()
                }

        })
        return binding.root
    }

}