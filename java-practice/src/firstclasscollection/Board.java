package firstclasscollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Board {
    private Tags tags;
    private String title;
}

class Tags {
    private List<Tag> tags = new ArrayList<>();

    public Tags(List<Tag> tags) {
//        validateTagList(tags);
//        validateTagLength(tags);
//        validateSize(tags);

        this.tags = Collections.unmodifiableList(tags);
    }

    public List<Tag> getDistinctTags(List<Tag> tags) {
        return tags.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Tag> appendDelimiter(List<Tag> tags) {
        return tags.stream()
                .map(tag -> new Tag("# " + tag.getTagName()))
                .collect(Collectors.toList());
    }
}

class Tag {
    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}