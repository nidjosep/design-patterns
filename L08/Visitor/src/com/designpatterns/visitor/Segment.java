package com.designpatterns.visitor;

public abstract class Segment {
    public abstract void accept(SegmentVisitor visitor);
}