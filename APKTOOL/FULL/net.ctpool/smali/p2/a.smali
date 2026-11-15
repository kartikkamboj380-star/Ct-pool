.class public Lp2/a;
.super LJ1/b;
.source "SourceFile"


# instance fields
.field private final A:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method protected constructor <init>(LJ1/c;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LJ1/b;-><init>(LJ1/c;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lp2/a;->A:Lcom/facebook/react/bridge/ReadableMap;

    .line 5
    .line 6
    return-void
.end method

.method public static z(LJ1/c;Lcom/facebook/react/bridge/ReadableMap;)Lp2/a;
    .locals 1

    .line 1
    new-instance v0, Lp2/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lp2/a;-><init>(LJ1/c;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public A()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lp2/a;->A:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-object v0
.end method
