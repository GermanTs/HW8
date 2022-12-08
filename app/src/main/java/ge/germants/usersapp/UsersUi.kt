package ge.germants.usersapp

import ge.germants.usersapp.databinding.LayoutMainFragmentBinding

interface UsersUi {

    fun handleView(binding: LayoutMainFragmentBinding, adapter: UsersAdapter)

    object Empty : UsersUi {
        override fun handleView(binding: LayoutMainFragmentBinding, adapter: UsersAdapter) = Unit
    }

    class SuccessUi(private val users: List<String>) : UsersUi {
        override fun handleView(binding: LayoutMainFragmentBinding, adapter: UsersAdapter) {
            binding.rvUsers.adapter = adapter
            adapter.submitList(users)
        }
    }

    class ErrorUi(private val errorMessage: String) : UsersUi {
        override fun handleView(binding: LayoutMainFragmentBinding, adapter: UsersAdapter) {
            // todo
        }
    }
}