.class LQ/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/d;->i(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/Object;

.field final synthetic n:LQ/d;


# direct methods
.method constructor <init>(LQ/d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/d$c;->n:LQ/d;

    .line 2
    .line 3
    iput-object p2, p0, LQ/d$c;->m:Ljava/lang/Object;

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
    iget-object v0, p0, LQ/d$c;->n:LQ/d;

    .line 2
    .line 3
    iget-object v1, p0, LQ/d$c;->m:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LQ/d;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
