package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeMission {

  private final List<Topic> topicList = new ArrayList<>();

  public static class Topic {

  }

  public void setTopic(Topic topic){
    this.topicList.add(topic);
  }

  public List<Topic> getTopicList (){
    return this.topicList;
  }
}
