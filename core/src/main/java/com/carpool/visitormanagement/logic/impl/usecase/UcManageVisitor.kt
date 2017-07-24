package com.carpool.visitormanagement.logic.impl.usecase

import com.carpool.visitormanagement.logic.api.to.VisitorEto

interface UcManageVisitor1 {
  
    /**
     * Deletes a visitor from the database by its id 'visitorId'.

     * @param visitorId Id of the visitor to delete
     * *
     * @return boolean `true` if the visitor can be deleted, `false` otherwise
     */
    fun deleteVisitor(visitorId: Long?): Boolean

    /**
     * Saves a visitor and store it in the database.

     * @param visitor the [VisitorEto] to create.
     * *
     * @return the new [VisitorEto] that has been saved with ID and version.
     */
    fun saveVisitor(visitor: VisitorEto): VisitorEto
}