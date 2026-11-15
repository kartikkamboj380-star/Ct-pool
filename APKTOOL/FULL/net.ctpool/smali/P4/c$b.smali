.class final LP4/c$b;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP4/c;-><init>(Lm5/g;LE4/e;LN4/b;LP4/a;LC/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LC/f;


# direct methods
.method constructor <init>(LC/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP4/c$b;->m:LC/f;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()LP4/g;
    .locals 2

    .line 1
    new-instance v0, LP4/g;

    .line 2
    .line 3
    iget-object v1, p0, LP4/c$b;->m:LC/f;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LP4/g;-><init>(LC/f;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP4/c$b;->a()LP4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
