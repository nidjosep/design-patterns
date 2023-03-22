package com.designpatterns.visitor;

public class FactSegment extends Segment {
    @Override
    public void accept(SegmentVisitor visitor) {
        visitor.visit(this);
    }
}