package io.bayce.page

import io.bayce.group.model.Group

/**
 * @author ashot.karapetyan on 2/12/18.
 */
class PageService {

	fun getAvailablePages(group: Group):List<Page> = listOf<Page>(Page("page1","{}"),Page("page2","{}"))
}