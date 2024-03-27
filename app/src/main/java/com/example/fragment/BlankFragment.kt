import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fragment.ComunicationViewModel
import com.example.fragment.R
import com.google.android.material.textfield.TextInputEditText

class BlankFragment : Fragment() {
    private var comunicationViewModel: ComunicationViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comunicationViewModel = ViewModelProvider(requireActivity()).get(ComunicationViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameEditText = view.findViewById<TextInputEditText>(R.id.input)

        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                comunicationViewModel!!.setName(charSequence.toString())
            }

            override fun afterTextChanged(editable: Editable) {}
        }
    }

    companion object {
        fun newInstance(): BlankFragment {
            return BlankFragment()
        }
    }
}