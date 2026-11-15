.class public final LP3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/f;


# instance fields
.field private final a:LQ3/f;


# direct methods
.method public constructor <init>(LQ3/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP3/x;->a:LQ3/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LP3/x;->a:LQ3/f;

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
    new-instance v1, LP3/w;

    .line 10
    .line 11
    invoke-direct {v1, v0}, LP3/w;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-object v1
.end method
