package stwtesting.autojava.tests;

import org.testng.annotations.Test;
import stwtesting.autojava.model.GroupData;
import stwtesting.autojava.model.Groups;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.goTo().groupPage();

    Groups before = app.group().all();
    GroupData group = new GroupData().withName("test5");
    app.group().create(group);
    Groups after = app.group().all();
    assertThat(app.group().count(), equalTo(before.size() +1));


    assertThat(after, equalTo(
            before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }


  @Test
  public void testBadGroupCreation() throws Exception {

    app.goTo().groupPage();

    Groups before = app.group().all();
    GroupData group = new GroupData().withName("test5'");
    app.group().create(group);
    assertThat(app.group().count(), equalTo(before.size()));
    Groups after = app.group().all();
    assertThat(after.size(), equalTo(before));


    assertThat(after, equalTo(
            before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }





}
