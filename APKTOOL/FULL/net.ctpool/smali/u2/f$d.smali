.class Lu2/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu2/g;

.field final synthetic b:Lu2/a;

.field final synthetic c:Ljava/util/concurrent/Executor;

.field final synthetic d:Lu2/f;


# direct methods
.method constructor <init>(Lu2/f;Lu2/g;Lu2/a;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/f$d;->d:Lu2/f;

    .line 2
    .line 3
    iput-object p2, p0, Lu2/f$d;->a:Lu2/g;

    .line 4
    .line 5
    iput-object p3, p0, Lu2/f$d;->b:Lu2/a;

    .line 6
    .line 7
    iput-object p4, p0, Lu2/f$d;->c:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu2/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lu2/f$d;->b(Lu2/f;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lu2/f;)Ljava/lang/Void;
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/f$d;->a:Lu2/g;

    .line 2
    .line 3
    iget-object v1, p0, Lu2/f$d;->b:Lu2/a;

    .line 4
    .line 5
    iget-object v2, p0, Lu2/f$d;->c:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-static {v0, v1, p1, v2}, Lu2/f;->a(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return-object p1
.end method
