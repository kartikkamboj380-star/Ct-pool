.class public final LP3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/f;


# instance fields
.field private final a:LQ3/f;

.field private final b:LQ3/f;


# direct methods
.method public constructor <init>(LQ3/f;LQ3/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP3/v;->a:LQ3/f;

    .line 5
    .line 6
    iput-object p2, p0, LP3/v;->b:LQ3/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LP3/v;->a:LQ3/f;

    .line 2
    .line 3
    check-cast v0, LP3/p;

    .line 4
    .line 5
    invoke-virtual {v0}, LP3/p;->b()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LP3/v;->b:LQ3/f;

    .line 10
    .line 11
    invoke-interface {v1}, LQ3/f;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, LP3/u;

    .line 16
    .line 17
    check-cast v1, LP3/w;

    .line 18
    .line 19
    invoke-direct {v2, v0, v1}, LP3/u;-><init>(Landroid/content/Context;LP3/w;)V

    .line 20
    .line 21
    .line 22
    return-object v2
.end method
