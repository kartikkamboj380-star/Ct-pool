.class Lu2/f$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/f$h;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu2/f$h;


# direct methods
.method constructor <init>(Lu2/f$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/f$h$a;->a:Lu2/f$h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu2/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lu2/f$h$a;->b(Lu2/f;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lu2/f;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu2/f;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lu2/f$h$a;->a:Lu2/f$h;

    .line 8
    .line 9
    iget-object p1, p1, Lu2/f$h;->o:Lu2/g;

    .line 10
    .line 11
    invoke-virtual {p1}, Lu2/g;->b()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lu2/f;->s()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lu2/f$h$a;->a:Lu2/f$h;

    .line 22
    .line 23
    iget-object v0, v0, Lu2/f$h;->o:Lu2/g;

    .line 24
    .line 25
    invoke-virtual {p1}, Lu2/f;->n()Ljava/lang/Exception;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, p0, Lu2/f$h$a;->a:Lu2/f$h;

    .line 34
    .line 35
    iget-object v0, v0, Lu2/f$h;->o:Lu2/g;

    .line 36
    .line 37
    invoke-virtual {p1}, Lu2/f;->o()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Lu2/g;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return-object p1
.end method
