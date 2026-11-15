.class public final LY5/f$d;
.super Lh6/d$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY5/f;->x(LY5/c;)Lh6/d$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic p:LY5/c;

.field final synthetic q:Li6/h;

.field final synthetic r:Li6/g;


# direct methods
.method constructor <init>(LY5/c;Li6/h;Li6/g;ZLi6/h;Li6/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY5/f$d;->p:LY5/c;

    .line 2
    .line 3
    iput-object p2, p0, LY5/f$d;->q:Li6/h;

    .line 4
    .line 5
    iput-object p3, p0, LY5/f$d;->r:Li6/g;

    .line 6
    .line 7
    invoke-direct {p0, p4, p5, p6}, Lh6/d$d;-><init>(ZLi6/h;Li6/g;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public close()V
    .locals 6

    .line 1
    iget-object v0, p0, LY5/f$d;->p:LY5/c;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual/range {v0 .. v5}, LY5/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    .line 9
    .line 10
    .line 11
    return-void
.end method
