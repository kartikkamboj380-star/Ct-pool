.class LY0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY0/a;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:LY0/e;

.field final synthetic n:LY0/a;


# direct methods
.method constructor <init>(LY0/a;LY0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY0/a$b;->n:LY0/a;

    .line 2
    .line 3
    iput-object p2, p0, LY0/a$b;->m:LY0/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LY0/a$b;->m:LY0/e;

    .line 2
    .line 3
    iget-object v1, p0, LY0/a$b;->n:LY0/a;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LY0/e;->b(LY0/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
