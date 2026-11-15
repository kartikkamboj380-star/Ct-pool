.class public LW1/a;
.super Lcom/facebook/react/u;
.source "SourceFile"


# instance fields
.field private final f:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/ReactActivity;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mainComponentName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/u;-><init>(Lcom/facebook/react/ReactActivity;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-boolean p3, p0, LW1/a;->f:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method protected j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LW1/a;->f:Z

    .line 2
    .line 3
    return v0
.end method
