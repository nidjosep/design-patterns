package com.designpatterns.visitor;

public class FormatSegment extends Segment {
    @Override
    public void accept(SegmentVisitor visitor) {
        visitor.visit(this);
    }
}