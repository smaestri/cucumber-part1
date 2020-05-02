package todo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TodoSteps {

    @Given("ma liste de todos est vide")
    public void initActions() {
        TodoService.listTodos = new ArrayList<>();
    }

    @When("^j'insére un todo avec la description (.*)$")
    public void insertAction(String description) {
        TodoService.listTodos.add(new Todo(description));
    }

    @Then("^ma liste contient un todo avec la description (.*)$")
    public void checkAction(String description) {
        assertEquals(1, TodoService.listTodos.size());
        assertEquals(description, TodoService.listTodos.get(0).getDescription());

    }



}
