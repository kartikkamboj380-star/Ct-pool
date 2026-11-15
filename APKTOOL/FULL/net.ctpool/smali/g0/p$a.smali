.class Lg0/p$a;
.super Lg0/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/p;->W()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg0/l;

.field final synthetic b:Lg0/p;


# direct methods
.method constructor <init>(Lg0/p;Lg0/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0/p$a;->b:Lg0/p;

    .line 2
    .line 3
    iput-object p2, p0, Lg0/p$a;->a:Lg0/l;

    .line 4
    .line 5
    invoke-direct {p0}, Lg0/m;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(Lg0/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/p$a;->a:Lg0/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/l;->W()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lg0/l;->S(Lg0/l$f;)Lg0/l;

    .line 7
    .line 8
    .line 9
    return-void
.end method
