.class Lh4/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/q;->a0()Lz3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh4/q;


# direct methods
.method constructor <init>(Lh4/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh4/q$c;->a:Lh4/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)Lz3/l;
    .locals 0

    .line 1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p1}, Lz3/o;->f(Ljava/lang/Object;)Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lz3/l;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh4/q$c;->a(Ljava/lang/Void;)Lz3/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
