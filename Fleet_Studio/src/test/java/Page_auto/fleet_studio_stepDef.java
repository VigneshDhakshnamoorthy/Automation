package Page_auto;

import java.util.List;

import io.cucumber.java.en.*;

public class fleet_studio_stepDef {
	@When("filter by name and check projects count")
	public void filter_by_name_and_check_projects_count(io.cucumber.datatable.DataTable dataTable) {
	
		List<String> filter_name = dataTable.column(0);
		List<Integer> count_project = List<Integer> dataTable.column(1);

		for (int i =1 ; i<filter_name.size();i++) {
			System.out.println(filter_name.get(i));
		}
	}
}
