.class Lg0/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/c;->p(Landroid/view/ViewGroup;Lg0/s;Lg0/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg0/c$k;

.field final synthetic b:Lg0/c;

.field private mViewBounds:Lg0/c$k;


# direct methods
.method constructor <init>(Lg0/c;Lg0/c$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0/c$h;->b:Lg0/c;

    .line 2
    .line 3
    iput-object p2, p0, Lg0/c$h;->a:Lg0/c$k;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lg0/c$h;->mViewBounds:Lg0/c$k;

    .line 9
    .line 10
    return-void
.end method
