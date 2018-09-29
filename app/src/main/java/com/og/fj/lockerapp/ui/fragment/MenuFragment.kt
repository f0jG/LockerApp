package com.og.fj.lockerapp.ui.fragment

import com.og.fj.lockerapp.R
import com.og.fj.lockerapp.util.setFragment
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : BaseFragment() {

    companion object {
        fun newInstance(): MenuFragment {
            return MenuFragment()
        }
    }

    override fun initialize() {
        menuBottomNav.setOnNavigationItemSelectedListener {
            onMenuItemSelected(it.itemId)
            true
        }
    }

    private fun onMenuItemSelected(itemId: Int) {
        val selectedFragment = when (itemId) {
            R.id.action_home -> MenuFragment.newInstance()
            R.id.action_locker -> LockerFragment.newInstance()
            R.id.action_diary -> DiaryFragment.newInstance()
            R.id.action_shops -> ShopFragment.newInstance()
            else -> null
        }

        selectedFragment?.let {
            setFragment(menuContainer.id, it)
        }
    }

    override fun layout(): Int {
        return R.layout.fragment_menu
    }

}