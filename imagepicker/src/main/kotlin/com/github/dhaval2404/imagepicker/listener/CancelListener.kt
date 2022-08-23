package com.github.dhaval2404.imagepicker.listener

/**
 * Interface used to allow the creator of a dialog to run some code when the
 * dialog is canceled.
 *
 */
interface CancelListener {

    /**
     * This method will be invoked when the dialog is canceled (not by picking a source).
     */
    fun onCancel()
}
