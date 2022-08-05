package com.mega.constraintdesign.nestedrecyclerview;

import java.util.List;

public class ParentItem {
    private List<ChildItem> ChildItemList;

    public ParentItem(List<ChildItem> childItemList) {
        ChildItemList = childItemList;
    }

    public List<ChildItem> getChildItemList() {
        return ChildItemList;
    }

    public void setChildItemList(List<ChildItem> childItemList) {
        ChildItemList = childItemList;
    }
}
