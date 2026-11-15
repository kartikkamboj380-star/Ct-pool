.class public LO0/f;
.super Ljava/util/ArrayList;
.source "SourceFile"


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static varargs c([Ljava/lang/Object;)LO0/f;
    .locals 2

    .line 1
    new-instance v0, LO0/f;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-direct {v0, v1}, LO0/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
