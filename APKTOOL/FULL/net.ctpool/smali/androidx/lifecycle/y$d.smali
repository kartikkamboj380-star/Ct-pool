.class final Landroidx/lifecycle/y$d;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/y;->e(Landroidx/lifecycle/I;)Landroidx/lifecycle/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Landroidx/lifecycle/y$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/y$d;

    invoke-direct {v0}, Landroidx/lifecycle/y$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/y$d;->m:Landroidx/lifecycle/y$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LP/a;)Landroidx/lifecycle/A;
    .locals 1

    .line 1
    const-string v0, "$this$initializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/lifecycle/A;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/lifecycle/A;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP/a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/y$d;->a(LP/a;)Landroidx/lifecycle/A;

    move-result-object p1

    return-object p1
.end method
