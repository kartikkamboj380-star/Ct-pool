.class public interface abstract LV0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/b;


# virtual methods
.method public bridge synthetic now()J
    .locals 2
    .annotation build LO0/d;
    .end annotation

    .line 1
    invoke-super {p0}, LV0/b;->now()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract synthetic nowNanos()J
    .annotation build LO0/d;
    .end annotation
.end method
